package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import com.unity3d.services.core.device.MimeTypes;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5304tw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AudioManager f33517a;

    public static synchronized AudioManager a(Context context) {
        try {
            final Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                f33517a = null;
            }
            AudioManager audioManager = f33517a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                final IN in = new IN(InterfaceC3471fM.f28270a);
                ZI.a().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Sv
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AbstractC5304tw.b(applicationContext, in);
                    }
                });
                in.d();
                AudioManager audioManager2 = f33517a;
                if (audioManager2 != null) {
                    return audioManager2;
                }
                throw null;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            f33517a = audioManager3;
            if (audioManager3 != null) {
                return audioManager3;
            }
            throw null;
        } catch (Throwable th) {
            throw th;
        }
    }

    static /* synthetic */ void b(Context context, IN in) {
        f33517a = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        in.a();
    }
}
