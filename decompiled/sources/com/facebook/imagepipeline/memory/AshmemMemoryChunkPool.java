package com.facebook.imagepipeline.memory;

import R2.C0956f;
import R2.F;
import R2.G;
import android.annotation.TargetApi;
import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes.dex */
@Y1.d
@TargetApi(DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER)
public class AshmemMemoryChunkPool extends e {
    @Y1.d
    public AshmemMemoryChunkPool(p013b2.d dVar, F f10, G g10) {
        super(dVar, f10, g10);
    }

    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public C0956f f(int i10) {
        return new C0956f(i10);
    }
}
