package com.github.kevin.component.app;

import android.app.Application;

import com.github.kevin.componentlib.config.AppConfig;
import com.github.kevin.componentlib.service.IAppComponent;

public class MainApp extends Application implements IAppComponent {
    private static MainApp instance;

    public static MainApp getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initialize(this);
    }

    @Override
    public void initialize(Application application) {
        instance = (MainApp) application;
        for (String component : AppConfig.COMPONENTS) {
            try {
                Class<?> clazz = Class.forName(component);
                Object object = clazz.newInstance();
                if (object instanceof IAppComponent) {
                    ((IAppComponent) object).initialize(this);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
