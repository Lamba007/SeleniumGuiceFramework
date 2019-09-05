package com.test.guice.framework.csvparser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class ParseCSVMap<T> {

    private static BufferedReader csvReader = null;
    private static LinkedHashMap <String, String> map;
    private static DataResolveIn dataResolveIn = new DataResolveIn();


    public void resolveData(T modelClass, String filePath, String scenarioName) {

        readCsv(filePath);

        LinkedHashMap <String, String> dataMap = null;

        try {
            dataMap = fetchScenarioValues(scenarioName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(dataMap);
        try {
            parseDataToClass(modelClass, dataMap);
        } catch (InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private void readCsv(String filePath) {

        try {
            csvReader = new BufferedReader(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private LinkedHashMap <String, String> fetchScenarioValues(String scenarioName) throws IOException {
        map = new LinkedHashMap <>();

        String row;
        int count = 0;
        String headerRow = null;
        assert csvReader != null;
        while ((row = csvReader.readLine()) != null) {

            String[] data = row.split(",");

            String[] dataRow = null;

            if (count == 0) {
                headerRow = row;

            } else if (data[0].equalsIgnoreCase(scenarioName)) {

                int i = 0;
                while (i < data.length) {
                    dataRow = headerRow.split(",");
                    String key=capitalize(dataRow[i].trim().replaceAll("\\s","").toLowerCase());
                    map.put(key, data[i]);
                    i++;
                }
            }
            count++;
        }
        csvReader.close();
        return map;
    }

    private void parseDataToClass(T modalObjectRef, HashMap <String, String> testList) throws InvocationTargetException, IllegalAccessException {


        Class <?> cname = modalObjectRef.getClass();

        Method modalClass;

        System.out.println(cname);

        List <String> listKeys = new ArrayList <>();
        listKeys.addAll(testList.keySet());

        List <String> listValues = new ArrayList <>();
        listValues.addAll(testList.values());

        int count = 0;
        while (count < listKeys.size()) {

            try {
                modalClass = cname.getMethod("set" + listKeys.get(count), String.class);
                modalClass.invoke(modalObjectRef, listValues.get(count));

                modalClass = cname.getMethod("get" + listKeys.get(count));
                System.out.println(listKeys.get(count) + "-" + modalClass.invoke(modalObjectRef));
            } catch (NoSuchMethodException e) {
            }

            count++;
        }
    }

    private static String capitalize(String str)
    {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static void main(String[] args) {

        String test="this  IS my test";

        String test1 = test.replaceAll("\\s","");
        System.out.println(test1);

        String key=capitalize(test.trim().replaceAll("\\s","").toLowerCase());
    }
}

