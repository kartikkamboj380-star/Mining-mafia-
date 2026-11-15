package com.unity3d.services.core.network.model;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public final class HttpResponse {

    @NotNull
    private final Object body;

    @NotNull
    private final String client;
    private final long contentSize;

    @NotNull
    private final Map<String, List<String>> headers;

    @NotNull
    private final String protocol;
    private final int statusCode;

    @NotNull
    private final String urlString;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object body) {
        this(body, 0, null, null, null, null, 0L, 126, null);
        Intrinsics.checkNotNullParameter(body, "body");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, Object obj, int i10, Map map, String str, String str2, String str3, long j10, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = httpResponse.body;
        }
        if ((i11 & 2) != 0) {
            i10 = httpResponse.statusCode;
        }
        if ((i11 & 4) != 0) {
            map = httpResponse.headers;
        }
        if ((i11 & 8) != 0) {
            str = httpResponse.urlString;
        }
        if ((i11 & 16) != 0) {
            str2 = httpResponse.protocol;
        }
        if ((i11 & 32) != 0) {
            str3 = httpResponse.client;
        }
        if ((i11 & 64) != 0) {
            j10 = httpResponse.contentSize;
        }
        long j11 = j10;
        String str4 = str2;
        String str5 = str3;
        return httpResponse.copy(obj, i10, map, str, str4, str5, j11);
    }

    @NotNull
    public final Object component1() {
        return this.body;
    }

    public final int component2() {
        return this.statusCode;
    }

    @NotNull
    public final Map<String, List<String>> component3() {
        return this.headers;
    }

    @NotNull
    public final String component4() {
        return this.urlString;
    }

    @NotNull
    public final String component5() {
        return this.protocol;
    }

    @NotNull
    public final String component6() {
        return this.client;
    }

    public final long component7() {
        return this.contentSize;
    }

    @NotNull
    public final HttpResponse copy(@NotNull Object body, int i10, @NotNull Map<String, ? extends List<String>> headers, @NotNull String urlString, @NotNull String protocol, @NotNull String client, long j10) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(client, "client");
        return new HttpResponse(body, i10, headers, urlString, protocol, client, j10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        return Intrinsics.b(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && Intrinsics.b(this.headers, httpResponse.headers) && Intrinsics.b(this.urlString, httpResponse.urlString) && Intrinsics.b(this.protocol, httpResponse.protocol) && Intrinsics.b(this.client, httpResponse.client) && this.contentSize == httpResponse.contentSize;
    }

    @NotNull
    public final Object getBody() {
        return this.body;
    }

    @NotNull
    public final String getClient() {
        return this.client;
    }

    public final long getContentSize() {
        return this.contentSize;
    }

    @NotNull
    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final String getProtocol() {
        return this.protocol;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    @NotNull
    public final String getUrlString() {
        return this.urlString;
    }

    public int hashCode() {
        return (((((((((((this.body.hashCode() * 31) + Integer.hashCode(this.statusCode)) * 31) + this.headers.hashCode()) * 31) + this.urlString.hashCode()) * 31) + this.protocol.hashCode()) * 31) + this.client.hashCode()) * 31) + Long.hashCode(this.contentSize);
    }

    @NotNull
    public String toString() {
        return "HttpResponse(body=" + this.body + ", statusCode=" + this.statusCode + ", headers=" + this.headers + ", urlString=" + this.urlString + ", protocol=" + this.protocol + ", client=" + this.client + ", contentSize=" + this.contentSize + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object body, int i10) {
        this(body, i10, null, null, null, null, 0L, 124, null);
        Intrinsics.checkNotNullParameter(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object body, int i10, @NotNull Map<String, ? extends List<String>> headers) {
        this(body, i10, headers, null, null, null, 0L, 120, null);
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object body, int i10, @NotNull Map<String, ? extends List<String>> headers, @NotNull String urlString) {
        this(body, i10, headers, urlString, null, null, 0L, 112, null);
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object body, int i10, @NotNull Map<String, ? extends List<String>> headers, @NotNull String urlString, @NotNull String protocol) {
        this(body, i10, headers, urlString, protocol, null, 0L, 96, null);
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object body, int i10, @NotNull Map<String, ? extends List<String>> headers, @NotNull String urlString, @NotNull String protocol, @NotNull String client) {
        this(body, i10, headers, urlString, protocol, client, 0L, 64, null);
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(client, "client");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpResponse(@NotNull Object body, int i10, @NotNull Map<String, ? extends List<String>> headers, @NotNull String urlString, @NotNull String protocol, @NotNull String client, long j10) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(client, "client");
        this.body = body;
        this.statusCode = i10;
        this.headers = headers;
        this.urlString = urlString;
        this.protocol = protocol;
        this.client = client;
        this.contentSize = j10;
    }

    public /* synthetic */ HttpResponse(Object obj, int i10, Map map, String str, String str2, String str3, long j10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i11 & 2) != 0 ? TTAdConstant.MATE_VALID : i10, (i11 & 4) != 0 ? E.g() : map, (i11 & 8) != 0 ? "" : str, (i11 & 16) == 0 ? str2 : "", (i11 & 32) != 0 ? "unknown" : str3, (i11 & 64) != 0 ? -1L : j10);
    }
}
