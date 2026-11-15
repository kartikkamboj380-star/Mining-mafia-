package H7;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends com.facebook.react.uimanager.events.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f1538e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f1539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f1540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f1541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final short f1542d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(int i10, int i11, float f10, boolean z9, boolean z10, short s10) {
        super(i10, i11);
        this.f1539a = f10;
        this.f1540b = z9;
        this.f1541c = z10;
        this.f1542d = s10;
    }

    @Override // com.facebook.react.uimanager.events.e
    public short getCoalescingKey() {
        return this.f1542d;
    }

    @Override // com.facebook.react.uimanager.events.e
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, this.f1539a);
        writableMapCreateMap.putInt("closing", this.f1540b ? 1 : 0);
        writableMapCreateMap.putInt("goingForward", this.f1541c ? 1 : 0);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.e
    public String getEventName() {
        return "topTransitionProgress";
    }
}
