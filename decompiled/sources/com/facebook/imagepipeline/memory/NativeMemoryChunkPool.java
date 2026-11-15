package com.facebook.imagepipeline.memory;

import R2.F;
import R2.G;

/* JADX INFO: loaded from: classes.dex */
@Y1.d
public class NativeMemoryChunkPool extends e {
    @Y1.d
    public NativeMemoryChunkPool(p013b2.d dVar, F f10, G g10) {
        super(dVar, f10, g10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public NativeMemoryChunk f(int i10) {
        return new NativeMemoryChunk(i10);
    }
}
