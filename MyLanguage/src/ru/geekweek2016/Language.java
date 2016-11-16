package ru.geekweek2016;

/**
 * Created by Cepegha on 15.11.2016.
 * Добавил перечисления для автоматизации обработки результатов опросника
 * Можно добавить информацию по курсам, ссылки, цены и т.д.
 */
public enum Language {
    JAVA("Java"),
    JAVA_SCRIPT("Java Script"),
    C_SHARP("C#"),
    C_LANG("C"),
    PHP("PHP"),
    C_PLUS("C++"),
    RUBY("Ruby"),
    PYTHON("Python"),
    OBJECTIVE_C("Objective-C");

    private String value;

    Language(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        switch (Language.this){
            case JAVA: return ("******************* \nРекомендуем Вам изучить "+Language.this.getValue()+" на сайте www.GeekBrains.ru");
            case C_SHARP: return ("******************* \nРекомендуем Вам изучить "+Language.this.getValue()+" на сайте www.GeekBrains.ru");
            case C_LANG: return ("******************* \nРекомендуем Вам изучить "+Language.this.getValue()+" на сайте www.GeekBrains.ru");
            case C_PLUS: return ("******************* \nРекомендуем Вам изучить "+Language.this.getValue()+" на сайте www.GeekBrains.ru");
            case RUBY: return ("******************* \nРекомендуем Вам изучить "+Language.this.getValue()+" на сайте www.GeekBrains.ru");
            case PYTHON: return ("******************* \nРекомендуем Вам изучить "+Language.this.getValue()+" на сайте www.GeekBrains.ru");
            case OBJECTIVE_C: return ("******************* \nРекомендуем Вам изучить "+Language.this.getValue()+" на сайте www.GeekBrains.ru");
            case PHP: return ("******************* \nРекомендуем Вам изучить "+Language.this.getValue()+" на сайте www.GeekBrains.ru");
            case JAVA_SCRIPT: return ("******************* \nРекомендуем Вам изучить "+Language.this.getValue()+" на сайте www.GeekBrains.ru");
            default: return "***Рекомендуем Вам выбрать другую профессию на сайте www.GeekBrains.ru";
        }
    }
}
