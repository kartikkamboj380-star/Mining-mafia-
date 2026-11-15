package com.unity3d.services.core.network.model;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.ads.core.data.model.OperationType;
import java.io.File;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public final class HttpRequest {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String DEFAULT_SCHEME = "https";
    public static final int DEFAULT_TIMEOUT = 30000;

    @NotNull
    private final String baseURL;

    @Nullable
    private final Object body;

    @NotNull
    private final BodyType bodyType;
    private final int callTimeout;
    private final int connectTimeout;

    @Nullable
    private final File downloadDestination;

    @NotNull
    private final Map<String, List<String>> headers;
    private final boolean isProtobuf;

    @NotNull
    private final RequestType method;

    @NotNull
    private final OperationType operationType;

    @NotNull
    private final Map<String, String> parameters;

    @NotNull
    private final String path;

    @Nullable
    private final Integer port;
    private final int priority;
    private final int readTimeout;

    @NotNull
    private final String scheme;
    private final int writeTimeout;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL) {
        this(baseURL, null, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131070, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpRequest copy$default(HttpRequest httpRequest, String str, String str2, RequestType requestType, Object obj, Map map, Map map2, BodyType bodyType, String str3, Integer num, int i10, int i11, int i12, int i13, boolean z9, OperationType operationType, File file, int i14, int i15, Object obj2) {
        int i16;
        File file2;
        String str4 = (i15 & 1) != 0 ? httpRequest.baseURL : str;
        String str5 = (i15 & 2) != 0 ? httpRequest.path : str2;
        RequestType requestType2 = (i15 & 4) != 0 ? httpRequest.method : requestType;
        Object obj3 = (i15 & 8) != 0 ? httpRequest.body : obj;
        Map map3 = (i15 & 16) != 0 ? httpRequest.headers : map;
        Map map4 = (i15 & 32) != 0 ? httpRequest.parameters : map2;
        BodyType bodyType2 = (i15 & 64) != 0 ? httpRequest.bodyType : bodyType;
        String str6 = (i15 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? httpRequest.scheme : str3;
        Integer num2 = (i15 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? httpRequest.port : num;
        int i17 = (i15 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? httpRequest.connectTimeout : i10;
        int i18 = (i15 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? httpRequest.readTimeout : i11;
        int i19 = (i15 & 2048) != 0 ? httpRequest.writeTimeout : i12;
        int i20 = (i15 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0 ? httpRequest.callTimeout : i13;
        boolean z10 = (i15 & 8192) != 0 ? httpRequest.isProtobuf : z9;
        String str7 = str4;
        OperationType operationType2 = (i15 & 16384) != 0 ? httpRequest.operationType : operationType;
        File file3 = (i15 & 32768) != 0 ? httpRequest.downloadDestination : file;
        if ((i15 & 65536) != 0) {
            file2 = file3;
            i16 = httpRequest.priority;
        } else {
            i16 = i14;
            file2 = file3;
        }
        return httpRequest.copy(str7, str5, requestType2, obj3, map3, map4, bodyType2, str6, num2, i17, i18, i19, i20, z10, operationType2, file2, i16);
    }

    @NotNull
    public final String component1() {
        return this.baseURL;
    }

    public final int component10() {
        return this.connectTimeout;
    }

    public final int component11() {
        return this.readTimeout;
    }

    public final int component12() {
        return this.writeTimeout;
    }

    public final int component13() {
        return this.callTimeout;
    }

    public final boolean component14() {
        return this.isProtobuf;
    }

    @NotNull
    public final OperationType component15() {
        return this.operationType;
    }

    @Nullable
    public final File component16() {
        return this.downloadDestination;
    }

    public final int component17() {
        return this.priority;
    }

    @NotNull
    public final String component2() {
        return this.path;
    }

    @NotNull
    public final RequestType component3() {
        return this.method;
    }

    @Nullable
    public final Object component4() {
        return this.body;
    }

    @NotNull
    public final Map<String, List<String>> component5() {
        return this.headers;
    }

    @NotNull
    public final Map<String, String> component6() {
        return this.parameters;
    }

    @NotNull
    public final BodyType component7() {
        return this.bodyType;
    }

    @NotNull
    public final String component8() {
        return this.scheme;
    }

    @Nullable
    public final Integer component9() {
        return this.port;
    }

    @NotNull
    public final HttpRequest copy(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull BodyType bodyType, @NotNull String scheme, @Nullable Integer num, int i10, int i11, int i12, int i13, boolean z9, @NotNull OperationType operationType, @Nullable File file, int i14) {
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(operationType, "operationType");
        return new HttpRequest(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, i13, z9, operationType, file, i14);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        return Intrinsics.b(this.baseURL, httpRequest.baseURL) && Intrinsics.b(this.path, httpRequest.path) && this.method == httpRequest.method && Intrinsics.b(this.body, httpRequest.body) && Intrinsics.b(this.headers, httpRequest.headers) && Intrinsics.b(this.parameters, httpRequest.parameters) && this.bodyType == httpRequest.bodyType && Intrinsics.b(this.scheme, httpRequest.scheme) && Intrinsics.b(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout && this.isProtobuf == httpRequest.isProtobuf && this.operationType == httpRequest.operationType && Intrinsics.b(this.downloadDestination, httpRequest.downloadDestination) && this.priority == httpRequest.priority;
    }

    @NotNull
    public final String getBaseURL() {
        return this.baseURL;
    }

    @Nullable
    public final Object getBody() {
        return this.body;
    }

    @NotNull
    public final BodyType getBodyType() {
        return this.bodyType;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    @Nullable
    public final File getDownloadDestination() {
        return this.downloadDestination;
    }

    @NotNull
    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final RequestType getMethod() {
        return this.method;
    }

    @NotNull
    public final OperationType getOperationType() {
        return this.operationType;
    }

    @NotNull
    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @Nullable
    public final Integer getPort() {
        return this.port;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    @NotNull
    public final String getScheme() {
        return this.scheme;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [int] */
    /* JADX WARN: Type inference failed for: r1v27, types: [int] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v36 */
    public int hashCode() {
        int iHashCode = ((((this.baseURL.hashCode() * 31) + this.path.hashCode()) * 31) + this.method.hashCode()) * 31;
        Object obj = this.body;
        int iHashCode2 = (((((((((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31) + this.headers.hashCode()) * 31) + this.parameters.hashCode()) * 31) + this.bodyType.hashCode()) * 31) + this.scheme.hashCode()) * 31;
        Integer num = this.port;
        int iHashCode3 = (((((((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.connectTimeout)) * 31) + Integer.hashCode(this.readTimeout)) * 31) + Integer.hashCode(this.writeTimeout)) * 31) + Integer.hashCode(this.callTimeout)) * 31;
        boolean z9 = this.isProtobuf;
        ?? r10 = z9;
        if (z9) {
            r10 = 1;
        }
        int iHashCode4 = (((iHashCode3 + r10) * 31) + this.operationType.hashCode()) * 31;
        File file = this.downloadDestination;
        return ((iHashCode4 + (file != null ? file.hashCode() : 0)) * 31) + Integer.hashCode(this.priority);
    }

    public final boolean isProtobuf() {
        return this.isProtobuf;
    }

    @NotNull
    public String toString() {
        return "HttpRequest(baseURL=" + this.baseURL + ", path=" + this.path + ", method=" + this.method + ", body=" + this.body + ", headers=" + this.headers + ", parameters=" + this.parameters + ", bodyType=" + this.bodyType + ", scheme=" + this.scheme + ", port=" + this.port + ", connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", writeTimeout=" + this.writeTimeout + ", callTimeout=" + this.callTimeout + ", isProtobuf=" + this.isProtobuf + ", operationType=" + this.operationType + ", downloadDestination=" + this.downloadDestination + ", priority=" + this.priority + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path) {
        this(baseURL, path, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131068, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method) {
        this(baseURL, path, method, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131064, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj) {
        this(baseURL, path, method, obj, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131056, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> headers) {
        this(baseURL, path, method, obj, headers, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131040, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters) {
        this(baseURL, path, method, obj, headers, parameters, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131008, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull BodyType bodyType) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, null, null, 0, 0, 0, 0, false, null, null, 0, 130944, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull BodyType bodyType, @NotNull String scheme) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, null, 0, 0, 0, 0, false, null, null, 0, 130816, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull BodyType bodyType, @NotNull String scheme, @Nullable Integer num) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, 0, 0, 0, 0, false, null, null, 0, 130560, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull BodyType bodyType, @NotNull String scheme, @Nullable Integer num, int i10) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, 0, 0, 0, false, null, null, 0, 130048, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull BodyType bodyType, @NotNull String scheme, @Nullable Integer num, int i10, int i11) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, 0, 0, false, null, null, 0, 129024, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull BodyType bodyType, @NotNull String scheme, @Nullable Integer num, int i10, int i11, int i12) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, 0, false, null, null, 0, 126976, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull BodyType bodyType, @NotNull String scheme, @Nullable Integer num, int i10, int i11, int i12, int i13) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, i13, false, null, null, 0, 122880, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull BodyType bodyType, @NotNull String scheme, @Nullable Integer num, int i10, int i11, int i12, int i13, boolean z9) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, i13, z9, null, null, 0, 114688, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull BodyType bodyType, @NotNull String scheme, @Nullable Integer num, int i10, int i11, int i12, int i13, boolean z9, @NotNull OperationType operationType) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, i13, z9, operationType, null, 0, 98304, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(operationType, "operationType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull BodyType bodyType, @NotNull String scheme, @Nullable Integer num, int i10, int i11, int i12, int i13, boolean z9, @NotNull OperationType operationType, @Nullable File file) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, i13, z9, operationType, file, 0, 65536, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(operationType, "operationType");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull BodyType bodyType, @NotNull String scheme, @Nullable Integer num, int i10, int i11, int i12, int i13, boolean z9, @NotNull OperationType operationType, @Nullable File file, int i14) {
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(operationType, "operationType");
        this.baseURL = baseURL;
        this.path = path;
        this.method = method;
        this.body = obj;
        this.headers = headers;
        this.parameters = parameters;
        this.bodyType = bodyType;
        this.scheme = scheme;
        this.port = num;
        this.connectTimeout = i10;
        this.readTimeout = i11;
        this.writeTimeout = i12;
        this.callTimeout = i13;
        this.isProtobuf = z9;
        this.operationType = operationType;
        this.downloadDestination = file;
        this.priority = i14;
    }

    public /* synthetic */ HttpRequest(String str, String str2, RequestType requestType, Object obj, Map map, Map map2, BodyType bodyType, String str3, Integer num, int i10, int i11, int i12, int i13, boolean z9, OperationType operationType, File file, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i15 & 2) != 0 ? "" : str2, (i15 & 4) != 0 ? RequestType.GET : requestType, (i15 & 8) != 0 ? null : obj, (i15 & 16) != 0 ? E.g() : map, (i15 & 32) != 0 ? E.g() : map2, (i15 & 64) != 0 ? BodyType.UNKNOWN : bodyType, (i15 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? DEFAULT_SCHEME : str3, (i15 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : num, (i15 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? 30000 : i10, (i15 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? 30000 : i11, (i15 & 2048) != 0 ? 30000 : i12, (i15 & CodedOutputStream.DEFAULT_BUFFER_SIZE) == 0 ? i13 : 30000, (i15 & 8192) != 0 ? false : z9, (i15 & 16384) != 0 ? OperationType.UNKNOWN : operationType, (i15 & 32768) != 0 ? null : file, (i15 & 65536) != 0 ? 0 : i14);
    }
}
