package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1253g extends C1255i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f14150d = new a(null);

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1253g(H2.x memoryCache, H2.k cacheKeyFactory, d0 inputProducer) {
        super(memoryCache, cacheKeyFactory, inputProducer);
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(cacheKeyFactory, "cacheKeyFactory");
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
    }

    @Override // com.facebook.imagepipeline.producers.C1255i
    protected String d() {
        return "pipe_ui";
    }

    @Override // com.facebook.imagepipeline.producers.C1255i
    protected String e() {
        return "BitmapMemoryCacheGetProducer";
    }

    @Override // com.facebook.imagepipeline.producers.C1255i
    protected InterfaceC1260n g(InterfaceC1260n consumer, S1.d cacheKey, boolean z9) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        return consumer;
    }
}
