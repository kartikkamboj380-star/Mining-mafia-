package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class QX0 implements InterfaceC4250lY0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4166kt0 f22395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4166kt0 f22396b;

    public QX0(final int i10) {
        InterfaceC4166kt0 interfaceC4166kt0 = new InterfaceC4166kt0() { // from class: com.google.android.gms.internal.ads.PX0
            @Override // com.google.android.gms.internal.ads.InterfaceC4166kt0
            public final /* synthetic */ Object zza() {
                return new HandlerThread(TX0.o(i10, "ExoPlayer:MediaCodecAsyncAdapter:"));
            }
        };
        InterfaceC4166kt0 interfaceC4166kt1 = new InterfaceC4166kt0() { // from class: com.google.android.gms.internal.ads.OX0
            @Override // com.google.android.gms.internal.ads.InterfaceC4166kt0
            public final /* synthetic */ Object zza() {
                return new HandlerThread(TX0.o(i10, "ExoPlayer:MediaCodecQueueingThread:"));
            }
        };
        this.f22395a = interfaceC4166kt0;
        this.f22396b = interfaceC4166kt1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4250lY0
    public final /* bridge */ /* synthetic */ InterfaceC4502nY0 a(C4124kY0 c4124kY0) {
        throw null;
    }

    public final TX0 b(C4124kY0 c4124kY0) throws Exception {
        Exception exc;
        MediaCodec mediaCodecCreateByCodecName;
        C4880qY0 c4880qY0 = c4124kY0.f30825a;
        String str = c4880qY0.f32656a;
        TX0 tx0 = null;
        try {
            StringBuilder sb = new StringBuilder(str.length() + 12);
            sb.append("createCodec:");
            sb.append(str);
            Trace.beginSection(sb.toString());
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                TX0 tx1 = new TX0(mediaCodecCreateByCodecName, (HandlerThread) this.f22395a.zza(), new WX0(mediaCodecCreateByCodecName, (HandlerThread) this.f22396b.zza()), c4124kY0.f30830f, null);
                try {
                    Trace.endSection();
                    Surface surface = c4124kY0.f30828d;
                    int i10 = 0;
                    if (surface == null && c4880qY0.f32663h && Build.VERSION.SDK_INT >= 35) {
                        i10 = 8;
                    }
                    tx1.l(c4124kY0.f30826b, surface, null, i10);
                    return tx1;
                } catch (Exception e10) {
                    exc = e10;
                    tx0 = tx1;
                    if (tx0 != null) {
                        tx0.zzl();
                        throw exc;
                    }
                    if (mediaCodecCreateByCodecName == null) {
                        throw exc;
                    }
                    mediaCodecCreateByCodecName.release();
                    throw exc;
                }
            } catch (Exception e11) {
                exc = e11;
            }
        } catch (Exception e12) {
            exc = e12;
            mediaCodecCreateByCodecName = null;
        }
    }
}
