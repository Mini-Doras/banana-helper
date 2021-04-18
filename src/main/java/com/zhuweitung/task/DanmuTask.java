package com.zhuweitung.task;

import com.zhuweitung.api.AcFunApiHelper;
import com.zhuweitung.model.VideoBase;
import lombok.extern.log4j.Log4j2;

/**
 * 发送弹幕任务
 * @author zhuweitung
 * @create 2021/4/18 
 */
@Log4j2
public class DanmuTask extends Task {

    @Override
    public void run() {
        VideoBase videoBase = AcFunApiHelper.getRandomVideo(AcFunApiHelper.TYPE_DANMU);
        AcFunApiHelper.danmu(videoBase);
    }

    @Override
    public String getName() {
        return "发送弹幕任务";
    }
}