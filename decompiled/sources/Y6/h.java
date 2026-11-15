package Y6;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final h DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile Parser<h> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.emptyMapField();
    private String url_ = "";
    private String responseContentType_ = "";
    private Internal.ProtobufList<k> perfSessions_ = GeneratedMessageLite.emptyProtobufList();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6977a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f6977a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6977a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6977a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6977a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6977a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6977a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6977a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b A(long j10) {
            copyOnWrite();
            ((h) this.instance).d0(j10);
            return this;
        }

        public b B(String str) {
            copyOnWrite();
            ((h) this.instance).setUrl(str);
            return this;
        }

        public String getUrl() {
            return ((h) this.instance).getUrl();
        }

        public b h(Iterable iterable) {
            copyOnWrite();
            ((h) this.instance).v(iterable);
            return this;
        }

        public b i() {
            copyOnWrite();
            ((h) this.instance).C().clear();
            return this;
        }

        public b k() {
            copyOnWrite();
            ((h) this.instance).w();
            return this;
        }

        public long l() {
            return ((h) this.instance).J();
        }

        public boolean m() {
            return ((h) this.instance).K();
        }

        public boolean n() {
            return ((h) this.instance).M();
        }

        public boolean o() {
            return ((h) this.instance).Q();
        }

        public b p(Map map) {
            copyOnWrite();
            ((h) this.instance).C().putAll(map);
            return this;
        }

        public b q(long j10) {
            copyOnWrite();
            ((h) this.instance).U(j10);
            return this;
        }

        public b r(d dVar) {
            copyOnWrite();
            ((h) this.instance).V(dVar);
            return this;
        }

        public b s(int i10) {
            copyOnWrite();
            ((h) this.instance).W(i10);
            return this;
        }

        public b t(e eVar) {
            copyOnWrite();
            ((h) this.instance).X(eVar);
            return this;
        }

        public b u(long j10) {
            copyOnWrite();
            ((h) this.instance).Y(j10);
            return this;
        }

        public b w(String str) {
            copyOnWrite();
            ((h) this.instance).Z(str);
            return this;
        }

        public b x(long j10) {
            copyOnWrite();
            ((h) this.instance).a0(j10);
            return this;
        }

        public b y(long j10) {
            copyOnWrite();
            ((h) this.instance).b0(j10);
            return this;
        }

        public b z(long j10) {
            copyOnWrite();
            ((h) this.instance).c0(j10);
            return this;
        }

        private b() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final MapEntryLite f6978a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            f6978a = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }
    }

    public enum d implements Internal.EnumLite {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);


        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final Internal.EnumLiteMap f6989l = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6991a;

        class a implements Internal.EnumLiteMap {
            a() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d findValueByNumber(int i10) {
                return d.d(i10);
            }
        }

        private static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final Internal.EnumVerifier f6992a = new b();

            private b() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i10) {
                return d.d(i10) != null;
            }
        }

        d(int i10) {
            this.f6991a = i10;
        }

        public static d d(int i10) {
            switch (i10) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        public static Internal.EnumVerifier e() {
            return b.f6992a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.f6991a;
        }
    }

    public enum e implements Internal.EnumLite {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Internal.EnumLiteMap f6995d = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6997a;

        class a implements Internal.EnumLiteMap {
            a() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e findValueByNumber(int i10) {
                return e.d(i10);
            }
        }

        private static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final Internal.EnumVerifier f6998a = new b();

            private b() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i10) {
                return e.d(i10) != null;
            }
        }

        e(int i10) {
            this.f6997a = i10;
        }

        public static e d(int i10) {
            if (i10 == 0) {
                return NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
            }
            if (i10 != 1) {
                return null;
            }
            return GENERIC_CLIENT_ERROR;
        }

        public static Internal.EnumVerifier e() {
            return b.f6998a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.f6997a;
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        GeneratedMessageLite.registerDefaultInstance(h.class, hVar);
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map C() {
        return S();
    }

    private MapFieldLite S() {
        if (!this.customAttributes_.isMutable()) {
            this.customAttributes_ = this.customAttributes_.mutableCopy();
        }
        return this.customAttributes_;
    }

    public static b T() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(long j10) {
        this.bitField0_ |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        this.clientStartTimeUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(d dVar) {
        this.httpMethod_ = dVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(int i10) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(e eVar) {
        this.networkClientErrorReason_ = eVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(long j10) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(long j10) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(long j10) {
        this.bitField0_ |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        this.timeToRequestCompletedUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(long j10) {
        this.bitField0_ |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        this.timeToResponseCompletedUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(long j10) {
        this.bitField0_ |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        this.timeToResponseInitiatedUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(Iterable iterable) {
        x();
        AbstractMessageLite.addAll(iterable, (List) this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        this.bitField0_ &= -65;
        this.responseContentType_ = z().F();
    }

    private void x() {
        Internal.ProtobufList<k> protobufList = this.perfSessions_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.perfSessions_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static h z() {
        return DEFAULT_INSTANCE;
    }

    public d A() {
        d dVarD = d.d(this.httpMethod_);
        return dVarD == null ? d.HTTP_METHOD_UNKNOWN : dVarD;
    }

    public int B() {
        return this.httpResponseCode_;
    }

    public List D() {
        return this.perfSessions_;
    }

    public long E() {
        return this.requestPayloadBytes_;
    }

    public String F() {
        return this.responseContentType_;
    }

    public long G() {
        return this.responsePayloadBytes_;
    }

    public long H() {
        return this.timeToRequestCompletedUs_;
    }

    public long I() {
        return this.timeToResponseCompletedUs_;
    }

    public long J() {
        return this.timeToResponseInitiatedUs_;
    }

    public boolean K() {
        return (this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0;
    }

    public boolean L() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean M() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean N() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean O() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean P() {
        return (this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0;
    }

    public boolean Q() {
        return (this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0;
    }

    public boolean R() {
        return (this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        a aVar = null;
        switch (a.f6977a[methodToInvoke.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000b᠌\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", d.e(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", e.e(), "customAttributes_", c.f6978a, "perfSessions_", k.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<h> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (h.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String getUrl() {
        return this.url_;
    }

    public long y() {
        return this.clientStartTimeUs_;
    }
}
