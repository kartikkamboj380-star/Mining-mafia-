package Z3;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0127a f7156a = new C0127a(null);

    /* JADX INFO: renamed from: Z3.a$a, reason: collision with other inner class name */
    public static final class C0127a {
        public /* synthetic */ C0127a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0127a() {
        }
    }

    public a(int i10, int i11) {
        super(i10, i11);
    }

    @Override // com.facebook.react.uimanager.events.e
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.e
    public String getEventName() {
        return "topDrawerClose";
    }
}
