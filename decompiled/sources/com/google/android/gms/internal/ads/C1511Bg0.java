package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Bg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1511Bg0 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f17671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f17672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AudioManager f17673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f17674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f17675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ExecutorService f17676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C2134Ng0 f17677g;

    public C1511Bg0(Handler handler, Context context, C5651wg0 c5651wg0, C2134Ng0 c2134Ng0) {
        super(handler);
        this.f17674d = new AtomicReference(Float.valueOf(-1.0f));
        this.f17675e = new AtomicBoolean(false);
        this.f17676f = Executors.newSingleThreadExecutor();
        this.f17671a = handler;
        this.f17672b = context;
        this.f17673c = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f17677g = c2134Ng0;
    }

    private final void h() {
        this.f17676f.submit(new RunnableC1459Ag0(this));
    }

    public final void a() {
        h();
        this.f17672b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void b() {
        this.f17672b.getContentResolver().unregisterContentObserver(this);
    }

    final /* synthetic */ float c() {
        AudioManager audioManager = this.f17673c;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (streamMaxVolume > 0) {
            if (streamVolume <= 0) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            f10 = streamVolume / streamMaxVolume;
            if (f10 > 1.0f) {
                return 1.0f;
            }
        }
        return f10;
    }

    final /* synthetic */ Handler d() {
        return this.f17671a;
    }

    final /* synthetic */ AtomicReference e() {
        return this.f17674d;
    }

    final /* synthetic */ AtomicBoolean f() {
        return this.f17675e;
    }

    final /* synthetic */ C2134Ng0 g() {
        return this.f17677g;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z9) {
        if (this.f17675e.getAndSet(true)) {
            return;
        }
        h();
    }
}
