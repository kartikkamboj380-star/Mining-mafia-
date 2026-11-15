package com.unity3d.services.ads.gmascar.handlers;

import V7.b;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;

/* JADX INFO: loaded from: classes3.dex */
public class SignalsHandler implements b {
    private GMAEventSender _gmaEventSender;

    public SignalsHandler(GMAEventSender gMAEventSender) {
        this._gmaEventSender = gMAEventSender;
    }

    @Override // V7.b
    public void onSignalsCollected(String str) {
        this._gmaEventSender.send(c.SIGNALS, str);
    }

    @Override // V7.b
    public void onSignalsCollectionFailed(String str) {
        this._gmaEventSender.send(c.SIGNALS_ERROR, str);
    }
}
