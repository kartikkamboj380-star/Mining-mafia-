package com.google.android.play.core.integrity;

import android.os.Bundle;
import app.notifee.core.event.LogEvent;
import com.google.android.gms.common.api.ApiException;

/* JADX INFO: loaded from: classes2.dex */
public final class X implements Y {
    X() {
    }

    @Override // com.google.android.play.core.integrity.Y
    public final ApiException a(Bundle bundle) {
        int i10 = bundle.getInt(LogEvent.LEVEL_ERROR);
        if (i10 == 0) {
            return null;
        }
        return new C6688b(i10, null);
    }
}
