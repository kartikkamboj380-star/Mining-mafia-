package com.facebook.imagepipeline.nativecode;

/* JADX INFO: loaded from: classes.dex */
@Y1.d
public class NativeJpegTranscoderFactory implements W2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f13964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f13965c;

    @Y1.d
    public NativeJpegTranscoderFactory(int i10, boolean z9, boolean z10) {
        this.f13963a = i10;
        this.f13964b = z9;
        this.f13965c = z10;
    }

    @Override // W2.d
    @Y1.d
    public W2.c createImageTranscoder(D2.c cVar, boolean z9) {
        if (cVar != D2.b.f440b) {
            return null;
        }
        return new NativeJpegTranscoder(z9, this.f13963a, this.f13964b, this.f13965c);
    }
}
