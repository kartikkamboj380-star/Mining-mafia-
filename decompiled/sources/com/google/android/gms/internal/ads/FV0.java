package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class FV0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f18763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EV0 f18764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f18765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BV0 f18766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BroadcastReceiver f18767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CV0 f18768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AV0 f18769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AudioDeviceInfo f18770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C4966rF f18771i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f18772j;

    /* JADX WARN: Multi-variable type inference failed */
    public FV0(Context context, EV0 ev0, C4966rF c4966rF, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.f18763a = applicationContext;
        this.f18764b = ev0;
        this.f18771i = c4966rF;
        this.f18770h = audioDeviceInfo;
        Handler handler = new Handler(AbstractC4634ob0.A(), null);
        this.f18765c = handler;
        this.f18766d = new BV0(this, 0 == true ? 1 : 0);
        this.f18767e = new DV0(this, null);
        Uri uriC = AV0.c();
        this.f18768f = uriC != null ? new CV0(this, handler, applicationContext.getContentResolver(), uriC) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void f(AV0 av0) {
        if (!this.f18772j || av0.equals(this.f18769g)) {
            return;
        }
        this.f18769g = av0;
        this.f18764b.a(av0);
    }

    public final void a(AV0 av0) {
        f(av0);
    }

    public final void b(C4966rF c4966rF) {
        if (Objects.equals(c4966rF, this.f18771i)) {
            return;
        }
        this.f18771i = c4966rF;
        f(AV0.a(this.f18763a, c4966rF, this.f18770h));
    }

    public final void c(AudioDeviceInfo audioDeviceInfo) {
        if (Objects.equals(audioDeviceInfo, this.f18770h)) {
            return;
        }
        this.f18770h = audioDeviceInfo;
        f(AV0.a(this.f18763a, this.f18771i, audioDeviceInfo));
    }

    public final AV0 d() {
        if (this.f18772j) {
            AV0 av0 = this.f18769g;
            av0.getClass();
            return av0;
        }
        this.f18772j = true;
        CV0 cv0 = this.f18768f;
        if (cv0 != null) {
            cv0.a();
        }
        Context context = this.f18763a;
        BV0 bv0 = this.f18766d;
        Handler handler = this.f18765c;
        AbstractC5304tw.a(context).registerAudioDeviceCallback(bv0, handler);
        AV0 av0B = AV0.b(context, context.registerReceiver(this.f18767e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), this.f18771i, this.f18770h);
        this.f18769g = av0B;
        return av0B;
    }

    public final void e() {
        if (this.f18772j) {
            this.f18769g = null;
            Context context = this.f18763a;
            AbstractC5304tw.a(context).unregisterAudioDeviceCallback(this.f18766d);
            context.unregisterReceiver(this.f18767e);
            CV0 cv0 = this.f18768f;
            if (cv0 != null) {
                cv0.b();
            }
            this.f18772j = false;
        }
    }

    final /* synthetic */ Context g() {
        return this.f18763a;
    }

    final /* synthetic */ AudioDeviceInfo h() {
        return this.f18770h;
    }

    final /* synthetic */ void i(AudioDeviceInfo audioDeviceInfo) {
        this.f18770h = null;
    }

    final /* synthetic */ C4966rF j() {
        return this.f18771i;
    }
}
