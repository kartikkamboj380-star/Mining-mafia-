package H7;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends com.facebook.react.uimanager.events.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1516b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1517a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(int i10, int i11, int i12) {
        super(i10, i11);
        this.f1517a = i12;
    }

    @Override // com.facebook.react.uimanager.events.e
    public short getCoalescingKey() {
        return (short) this.f1517a;
    }

    @Override // com.facebook.react.uimanager.events.e
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("headerHeight", this.f1517a);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.e
    public String getEventName() {
        return "topHeaderHeightChange";
    }
}
