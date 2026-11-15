package com.facebook.react.fabric;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.soloader.SoLoader;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f14839a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f14840b;

    private b() {
    }

    public static final void a() {
        if (f14840b) {
            return;
        }
        p065g4.a.c(0L, "FabricSoLoader");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
        SoLoader.t("fabricjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
        p065g4.a.i(0L);
        f14840b = true;
    }
}
