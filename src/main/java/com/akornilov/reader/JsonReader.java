package com.akornilov.reader;

import com.google.gson.Gson;
import org.apache.commons.lang3.StringUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

import static com.akornilov.utils.Constants.DEFAULT_FILE_WITH_DATA;

public class JsonReader implements DataReader {

    private String filePath;
    private Integer[][][] map;

    public JsonReader(String filePath) {
        this.filePath = filePath;
    }

    public void read() {
        Gson gson = new Gson();
        if (StringUtils.isEmpty(filePath)) {
            filePath = DEFAULT_FILE_WITH_DATA;
        }
        try {
            map = gson.fromJson(new FileReader(filePath), Integer[][][].class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public Integer[][][] getMap() {
        return map;
    }

    public static void main(String[] args) {
        JsonReader reader = new JsonReader("");
        reader.read();
        System.out.println(Arrays.deepToString(reader.getMap()));
    }
}
