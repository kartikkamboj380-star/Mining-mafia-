package com.facebook.imagepipeline.producers;

import java.io.FileInputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class M extends L {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f14051c = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(Executor executor, p013b2.i pooledByteBufferFactory) {
        super(executor, pooledByteBufferFactory);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected O2.j d(U2.b imageRequest) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        return e(new FileInputStream(imageRequest.u().toString()), (int) imageRequest.u().length());
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected String f() {
        return "LocalFileFetchProducer";
    }
}
