package Y6;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final m DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<m> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private long durationUs_;
    private boolean isAuto_;
    private MapFieldLite<String, Long> counters_ = MapFieldLite.emptyMapField();
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.emptyMapField();
    private String name_ = "";
    private Internal.ProtobufList<m> subtraces_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<k> perfSessions_ = GeneratedMessageLite.emptyProtobufList();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7007a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f7007a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7007a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7007a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7007a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7007a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7007a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7007a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b h(Iterable iterable) {
            copyOnWrite();
            ((m) this.instance).q(iterable);
            return this;
        }

        public b i(Iterable iterable) {
            copyOnWrite();
            ((m) this.instance).r(iterable);
            return this;
        }

        public b k(k kVar) {
            copyOnWrite();
            ((m) this.instance).s(kVar);
            return this;
        }

        public b l(m mVar) {
            copyOnWrite();
            ((m) this.instance).t(mVar);
            return this;
        }

        public b m(Map map) {
            copyOnWrite();
            ((m) this.instance).C().putAll(map);
            return this;
        }

        public b n(Map map) {
            copyOnWrite();
            ((m) this.instance).D().putAll(map);
            return this;
        }

        public b o(String str, long j10) {
            str.getClass();
            copyOnWrite();
            ((m) this.instance).C().put(str, Long.valueOf(j10));
            return this;
        }

        public b p(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((m) this.instance).D().put(str, str2);
            return this;
        }

        public b q(long j10) {
            copyOnWrite();
            ((m) this.instance).M(j10);
            return this;
        }

        public b r(long j10) {
            copyOnWrite();
            ((m) this.instance).N(j10);
            return this;
        }

        public b s(String str) {
            copyOnWrite();
            ((m) this.instance).setName(str);
            return this;
        }

        private b() {
            super(m.DEFAULT_INSTANCE);
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final MapEntryLite f7008a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT64, 0L);
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final MapEntryLite f7009a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            f7009a = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }
    }

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        GeneratedMessageLite.registerDefaultInstance(m.class, mVar);
    }

    private m() {
    }

    public static m A() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map C() {
        return J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map D() {
        return K();
    }

    private MapFieldLite H() {
        return this.counters_;
    }

    private MapFieldLite I() {
        return this.customAttributes_;
    }

    private MapFieldLite J() {
        if (!this.counters_.isMutable()) {
            this.counters_ = this.counters_.mutableCopy();
        }
        return this.counters_;
    }

    private MapFieldLite K() {
        if (!this.customAttributes_.isMutable()) {
            this.customAttributes_ = this.customAttributes_.mutableCopy();
        }
        return this.customAttributes_;
    }

    public static b L() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(long j10) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(long j10) {
        this.bitField0_ |= 8;
        this.durationUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(Iterable iterable) {
        v();
        AbstractMessageLite.addAll(iterable, (List) this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(Iterable iterable) {
        w();
        AbstractMessageLite.addAll(iterable, (List) this.subtraces_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(k kVar) {
        kVar.getClass();
        v();
        this.perfSessions_.add(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(m mVar) {
        mVar.getClass();
        w();
        this.subtraces_.add(mVar);
    }

    private void v() {
        Internal.ProtobufList<k> protobufList = this.perfSessions_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.perfSessions_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void w() {
        Internal.ProtobufList<m> protobufList = this.subtraces_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.subtraces_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public long B() {
        return this.durationUs_;
    }

    public List E() {
        return this.perfSessions_;
    }

    public List F() {
        return this.subtraces_;
    }

    public boolean G() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        a aVar = null;
        switch (a.f7007a[methodToInvoke.ordinal()]) {
            case 1:
                return new m();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", c.f7008a, "subtraces_", m.class, "customAttributes_", d.f7009a, "perfSessions_", k.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<m> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (m.class) {
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

    public String getName() {
        return this.name_;
    }

    public boolean u(String str) {
        str.getClass();
        return I().containsKey(str);
    }

    public int x() {
        return H().size();
    }

    public Map y() {
        return Collections.unmodifiableMap(H());
    }

    public Map z() {
        return Collections.unmodifiableMap(I());
    }
}
