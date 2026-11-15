package H7;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends com.facebook.react.uimanager.events.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1553c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f1555b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public s(int i10, int i11, int i12, boolean z9) {
        super(i10, i11);
        this.f1554a = i12;
        this.f1555b = z9;
    }

    @Override // com.facebook.react.uimanager.events.e
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.e
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("index", this.f1554a);
        writableMapCreateMap.putBoolean("isStable", this.f1555b);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.e
    public String getEventName() {
        return "topSheetDetentChanged";
    }
}
