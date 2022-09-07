package com.wind.xpatch.proxy;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.Log;

import com.wind.xposed.entry.SandHookInitialization;
import com.wind.xposed.entry.util.FileUtils;
import com.wind.xposed.entry.util.VMRuntime;
import com.wind.xposed.entry.util.XpatchUtils;

import java.util.ArrayList;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;

import static com.wind.xposed.entry.XposedModuleEntry.init;

import org.lsposed.hiddenapibypass.HiddenApiBypass;

/**
 * Created by Windysha
 */
public class XpatchProxyApplication extends com.ctrip.ztthemis.XpatchProxyApplication {

}
