package example_apps.good_weather.app_1;

import code_generator.Compiler;

public class Main {
    public static void main(String[] args) {
        Compiler.main(new String[]{System.getProperty("user.dir") + "/src/example_apps/good_weather/app_1/app.ds"});
    }
}