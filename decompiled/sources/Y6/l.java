package Y6;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes3.dex */
public enum l implements Internal.EnumLite {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Internal.EnumLiteMap f7003d = new Internal.EnumLiteMap() { // from class: Y6.l.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l findValueByNumber(int i10) {
            return l.d(i10);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7005a;

    private static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Internal.EnumVerifier f7006a = new b();

        private b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i10) {
            return l.d(i10) != null;
        }
    }

    l(int i10) {
        this.f7005a = i10;
    }

    public static l d(int i10) {
        if (i10 == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i10 != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    public static Internal.EnumVerifier e() {
        return b.f7006a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f7005a;
    }
}
