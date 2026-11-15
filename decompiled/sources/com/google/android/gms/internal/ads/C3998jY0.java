package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3998jY0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet f30483a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LoudnessCodecController f30484b;

    public C3998jY0(InterfaceC3370eY0 interfaceC3370eY0) {
    }

    public final void a(int i10) {
        LoudnessCodecController loudnessCodecController = this.f30484b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f30484b = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i10, AbstractC2272Px0.a(), new C3119cY0(this));
        this.f30484b = loudnessCodecControllerCreate;
        Iterator it = this.f30483a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public final void b(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f30484b;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            AbstractC2418Ss0.i(this.f30483a.add(mediaCodec));
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f30483a.remove(mediaCodec) || (loudnessCodecController = this.f30484b) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void d() {
        this.f30483a.clear();
        LoudnessCodecController loudnessCodecController = this.f30484b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }
}
