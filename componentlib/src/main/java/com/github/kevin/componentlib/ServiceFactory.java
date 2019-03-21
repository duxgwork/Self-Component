package com.github.kevin.componentlib;

import com.github.kevin.componentlib.service.ILoginService;
import com.github.kevin.componentlib.service.IMineService;
import com.github.kevin.componentlib.service.impl.EmptyLoginService;
import com.github.kevin.componentlib.service.impl.EmptyMineService;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();
    private ILoginService loginService;
    private IMineService mineService;

    private ServiceFactory(){

    }

    public static ServiceFactory getInstance() {
        return instance;
    }

    //注意：尽量不要使用抛异常的方式来解决问题，因为在数据量很大的情况下，很容易造成内存爆掉的情况。
    public ILoginService getLoginService() {
        if (loginService == null){
            loginService = new EmptyLoginService();
        }
        return loginService;
    }

    public void setLoginService(ILoginService loginService) {
        this.loginService = loginService;
    }

    public IMineService getMineService() {
        if (mineService == null){
            mineService = new EmptyMineService();
        }
        return mineService;
    }

    public void setMineService(IMineService mineService) {
        this.mineService = mineService;
    }

}
