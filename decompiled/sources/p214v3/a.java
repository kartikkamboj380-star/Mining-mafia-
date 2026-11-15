package p214v3;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p064g3.b;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C0549a f50117c = new C0549a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WritableMap f50119b;

    /* JADX INFO: renamed from: v3.a$a, reason: collision with other inner class name */
    private static final class C0549a {
        public /* synthetic */ C0549a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0549a() {
        }
    }

    static {
        b.b("InteropEvent", null, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String interopEventName, WritableMap writableMap, int i10, int i11) {
        super(i10, i11);
        Intrinsics.checkNotNullParameter(interopEventName, "interopEventName");
        this.f50118a = interopEventName;
        this.f50119b = writableMap;
    }

    @Override // com.facebook.react.uimanager.events.e
    protected WritableMap getEventData() {
        return this.f50119b;
    }

    @Override // com.facebook.react.uimanager.events.e
    public String getEventName() {
        return this.f50118a;
    }
}
