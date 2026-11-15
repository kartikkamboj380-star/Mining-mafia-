package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.unity3d.services.core.device.MimeTypes;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class U30 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f23898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f23899b;

    public U30(InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, Context context) {
        this.f23898a = interfaceExecutorServiceC1805Gx0;
        this.f23899b = context;
    }

    final /* synthetic */ V30 a() {
        int i10;
        int streamMaxVolume;
        AudioManager audioManager = (AudioManager) this.f23899b.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        float fB = G4.t.m().b();
        boolean zD = G4.t.m().d();
        if (audioManager == null) {
            return new V30(-1, false, false, -1, -1, -1, -1, -1, fB, zD, true);
        }
        int mode = audioManager.getMode();
        boolean zIsMusicActive = audioManager.isMusicActive();
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) H4.B.c().d(AbstractC3892ii.wc)).booleanValue()) {
            int iJ = G4.t.j().j(audioManager);
            streamMaxVolume = audioManager.getStreamMaxVolume(3);
            i10 = iJ;
        } else {
            i10 = -1;
            streamMaxVolume = -1;
        }
        return new V30(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, i10, streamMaxVolume, audioManager.getRingerMode(), audioManager.getStreamVolume(2), fB, zD, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return this.f23898a.e0(new Callable() { // from class: com.google.android.gms.internal.ads.T30
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f23376a.a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 13;
    }
}
