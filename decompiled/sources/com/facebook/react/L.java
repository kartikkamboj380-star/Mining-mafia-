package com.facebook.react;

import android.content.Context;
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint;
import com.facebook.react.soloader.OpenSourceMergedSoMapping;
import com.facebook.soloader.SoLoader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {
    public static void a(Context context) {
        try {
            SoLoader.l(context, OpenSourceMergedSoMapping.f15303a);
            DefaultNewArchitectureEntryPoint.load();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
