package com.facebook.react.uimanager;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface D0 {
    void destroyState();

    ReadableMapBuffer getStateDataMapBuffer();

    void updateState(WritableMap writableMap);
}
