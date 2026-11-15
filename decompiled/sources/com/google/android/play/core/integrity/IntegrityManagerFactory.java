package com.google.android.play.core.integrity;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class IntegrityManagerFactory {
    public static InterfaceC6689c a(Context context) {
        return AbstractC6707v.a(context).a();
    }

    @NonNull
    public static IntegrityManager create(Context context) {
        return j0.a(context).a();
    }
}
