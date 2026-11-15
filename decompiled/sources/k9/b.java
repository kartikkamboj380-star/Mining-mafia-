package k9;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f45717b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45731a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(int i10) {
            for (b bVar : b.values()) {
                if (bVar.d() == i10) {
                    return bVar;
                }
            }
            return null;
        }

        private a() {
        }
    }

    b(int i10) {
        this.f45731a = i10;
    }

    public final int d() {
        return this.f45731a;
    }
}
