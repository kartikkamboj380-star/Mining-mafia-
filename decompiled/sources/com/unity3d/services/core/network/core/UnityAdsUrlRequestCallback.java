package com.unity3d.services.core.network.core;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p129m8.m;
import p129m8.n;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public abstract class UnityAdsUrlRequestCallback extends UrlRequest.Callback {
    private static final int BYTE_BUFFER_CAPACITY_BYTES = 16384;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final ByteArrayOutputStream bytesReceived;
    private final WritableByteChannel receiveChannel;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public UnityAdsUrlRequestCallback() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.bytesReceived = byteArrayOutputStream;
        this.receiveChannel = Channels.newChannel(byteArrayOutputStream);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onReadCompleted(@NotNull UrlRequest request, @NotNull UrlResponseInfo info, @NotNull ByteBuffer byteBuffer) {
        Object objB;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        byteBuffer.flip();
        try {
            m.a aVar = m.f46450b;
            this.receiveChannel.write(byteBuffer);
            byteBuffer.clear();
            request.read(byteBuffer);
            objB = m.b(Unit.f45918a);
        } catch (Throwable th) {
            m.a aVar2 = m.f46450b;
            objB = m.b(n.a(th));
        }
        if (m.d(objB) != null) {
            request.cancel();
            onFailed(request, info, null);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onRedirectReceived(@NotNull UrlRequest request, @Nullable UrlResponseInfo urlResponseInfo, @Nullable String str) {
        Intrinsics.checkNotNullParameter(request, "request");
        request.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(@NotNull UrlRequest request, @NotNull UrlResponseInfo info) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(info, "info");
        request.read(ByteBuffer.allocateDirect(BYTE_BUFFER_CAPACITY_BYTES));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(@NotNull UrlRequest request, @NotNull UrlResponseInfo info) {
        Object objB;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(info, "info");
        try {
            m.a aVar = m.f46450b;
            objB = m.b(this.bytesReceived.toByteArray());
        } catch (Throwable th) {
            m.a aVar2 = m.f46450b;
            objB = m.b(n.a(th));
        }
        if (m.g(objB)) {
            byte[] bodyBytes = (byte[]) objB;
            Intrinsics.checkNotNullExpressionValue(bodyBytes, "bodyBytes");
            onSucceeded(request, info, bodyBytes);
        }
        if (m.d(objB) != null) {
            onFailed(request, info, null);
        }
    }

    public abstract void onSucceeded(@NotNull UrlRequest urlRequest, @NotNull UrlResponseInfo urlResponseInfo, @NotNull byte[] bArr);
}
