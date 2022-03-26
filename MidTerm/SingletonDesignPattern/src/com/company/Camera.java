package com.company;

public class Camera {

    private Camera(){
    }

    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }
    public String getCameraName() {
        return cameraName;
    }


    private static  Camera _instance;
    private static Object obj = new Object();
    private String cameraName = "";

    public static Camera getInstance(){

        if(_instance == null){
            synchronized (obj){
                //for double locking we can check the instance twice
                if(_instance == null){
                    _instance = new Camera();
               }

            }
        }
        return _instance;
    }
}
