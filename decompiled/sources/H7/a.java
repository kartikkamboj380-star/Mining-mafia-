package H7;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends com.facebook.react.uimanager.events.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0028a f1513a = new C0028a(null);

    /* JADX INFO: renamed from: H7.a$a, reason: collision with other inner class name */
    public static final class C0028a {
        public /* synthetic */ C0028a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0028a() {
        }
    }

    public a(int i10, int i11) {
        super(i10, i11);
    }

    @Override // com.facebook.react.uimanager.events.e
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.e
    protected WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.e
    public String getEventName() {
        return "topAttached";
    }
}
