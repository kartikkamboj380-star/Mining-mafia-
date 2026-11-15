package com.iab.omid.library.bytedance2.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.unity3d.services.core.device.MimeTypes;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f41757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f41758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f41759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f41760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f41761e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f41757a = context;
        this.f41758b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f41759c = aVar;
        this.f41760d = cVar;
    }

    private float a() {
        return this.f41759c.a(this.f41758b.getStreamVolume(3), this.f41758b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f41760d.a(this.f41761e);
    }

    public void c() {
        this.f41761e = a();
        b();
        this.f41757a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f41757a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z9) {
        super.onChange(z9);
        float fA = a();
        if (a(fA)) {
            this.f41761e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f41761e;
    }
}
