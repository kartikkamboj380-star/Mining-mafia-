package com.reactnativegooglesignin;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes3.dex */
public class n extends com.facebook.react.uimanager.events.e {
    public n(int i10, int i11) {
        super(i10, i11);
    }

    @Override // com.facebook.react.uimanager.events.e
    protected WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.e
    public String getEventName() {
        return "topPress";
    }
}
