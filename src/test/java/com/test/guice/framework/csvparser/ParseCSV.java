package com.test.guice.framework.csvparser;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class ParseCSV {

    private static BufferedReader csvReader = null;
    private static LinkedHashMap <String, String> map;
    private static DataResolveIn dataResolveIn = new DataResolveIn();


    private static void readCsv() {

        String pathToCsv = "src\\test\\resources\\qa.csv";

        try {
            csvReader = new BufferedReader(new FileReader(pathToCsv));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static LinkedHashMap <String, String> generateCsvMap(String scenarioName) throws IOException {
        map = new LinkedHashMap <>();

        String row;
        int count = 0;
        String headerRow = null;
        assert csvReader != null;
        while ((row = csvReader.readLine()) != null) {

            String[] data = row.split(",");

            String[] data1 = null;

            if (count == 0) {
                headerRow = row;

            } else if (data[0].equals(scenarioName)) {

                int i = 0;
                while (i < data.length) {
                    data1 = headerRow.split(",");
                    map.put(data1[i], data[i]);
                    i++;
                }
            }
            count++;
        }
        csvReader.close();
        return map;
    }

    public static void main(String[] args) throws IOException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {

        readCsv();
        LinkedHashMap <String, String> dataMap = generateCsvMap("create a PM with cost");

        System.out.println(dataMap);
        csvDataResolver(dataMap);

    }

    public static void csvDataResolver(HashMap <String, String> testList) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {


        Class cname = dataResolveIn.getClass();
        cname.getName();

        Method modalClass;

        System.out.println(cname);

        List <String> keyList = new ArrayList <>();

        keyList.addAll(testList.values());


        List <String> keyValue = new ArrayList <>();

        keyValue.addAll(testList.values());



        int count = 0;
        while (count < keyList.size()) {

            modalClass = cname.getMethod("set" + keyList.get(count), String.class);
            modalClass.invoke(dataResolveIn, keyValue.get(count));

            modalClass = DataResolveIn.class.getMethod("get" + keyList.get(count));
            System.out.println(keyList.get(count) + "-" + modalClass.invoke(dataResolveIn));

            count++;
        }
    }

    public static void resolverDataCsv(Class modalObjectRef, String csvName,String scenarioName){

        readCsv();

        LinkedHashMap <String, String> dataMap = null;
        try {
            dataMap = generateCsvMap(scenarioName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(dataMap);
        try {
            csvDataResolver(dataMap);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void dataResolver(DataResolveIn dataresolvein) throws IOException {


//        dataresolvein= new DataResolveIn();
        readCsv();

        String t = "getFname";
        //String s=split(",",list.get(0))
        try {
            Method method = DataResolveIn.class.getDeclaredMethod("Method" + t, String.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

//        Map<String,String> map= new HashMap <>();


    }
}

