package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends L {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f14158d = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ContentResolver f14159c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Executor executor, p013b2.i pooledByteBufferFactory, ContentResolver contentResolver) {
        super(executor, pooledByteBufferFactory);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.f14159c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected O2.j d(U2.b imageRequest) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        InputStream inputStreamOpenInputStream = this.f14159c.openInputStream(imageRequest.v());
        if (inputStreamOpenInputStream == null) {
            throw new IllegalStateException("ContentResolver returned null InputStream");
        }
        O2.j jVarE = e(inputStreamOpenInputStream, -1);
        Intrinsics.checkNotNullExpressionValue(jVarE, "getEncodedImage(...)");
        return jVarE;
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected String f() {
        return "QualifiedResourceFetchProducer";
    }
}
