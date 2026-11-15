package p168q7;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.unity3d.services.core.device.MimeTypes;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f48097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f48098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f48099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f48100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f48101e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f48097a = context;
        this.f48098b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f48099c = aVar;
        this.f48100d = cVar;
    }

    private float a() {
        return this.f48099c.a(this.f48098b.getStreamVolume(3), this.f48098b.getStreamMaxVolume(3));
    }

    private boolean b(float f10) {
        return f10 != this.f48101e;
    }

    private void c() {
        this.f48100d.a(this.f48101e);
    }

    public void d() {
        this.f48101e = a();
        c();
        this.f48097a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void e() {
        this.f48097a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z9) {
        super.onChange(z9);
        float fA = a();
        if (b(fA)) {
            this.f48101e = fA;
            c();
        }
    }
}
