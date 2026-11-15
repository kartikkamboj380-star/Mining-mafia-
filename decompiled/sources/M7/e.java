package M7;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends com.facebook.react.uimanager.events.e implements K7.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f3536b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3537a;

    public static final class a implements K7.c {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // K7.c
        public String a() {
            return "onNativeFocusChange";
        }

        @Override // K7.c
        public String getEventName() {
            return "topNativeFocusChange";
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i10, int i11, String tabKey) {
        super(i10, i11);
        Intrinsics.checkNotNullParameter(tabKey, "tabKey");
        this.f3537a = tabKey;
    }

    @Override // K7.c
    public String a() {
        return "onNativeFocusChange";
    }

    @Override // com.facebook.react.uimanager.events.e
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.e
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("tabKey", this.f3537a);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.e
    public String getEventName() {
        return "topNativeFocusChange";
    }
}
