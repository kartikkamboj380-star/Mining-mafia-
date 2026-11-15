package Y6;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes3.dex */
public enum d implements Internal.EnumLite {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Internal.EnumLiteMap f6970f = new Internal.EnumLiteMap() { // from class: Y6.d.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d findValueByNumber(int i10) {
            return d.d(i10);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6972a;

    private static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Internal.EnumVerifier f6973a = new b();

        private b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i10) {
            return d.d(i10) != null;
        }
    }

    d(int i10) {
        this.f6972a = i10;
    }

    public static d d(int i10) {
        if (i10 == 0) {
            return APPLICATION_PROCESS_STATE_UNKNOWN;
        }
        if (i10 == 1) {
            return FOREGROUND;
        }
        if (i10 == 2) {
            return BACKGROUND;
        }
        if (i10 != 3) {
            return null;
        }
        return FOREGROUND_BACKGROUND;
    }

    public static Internal.EnumVerifier e() {
        return b.f6973a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f6972a;
    }
}
