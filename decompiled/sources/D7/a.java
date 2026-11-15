package D7;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends com.facebook.react.uimanager.events.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0018a f480b = new C0018a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WritableMap f481a;

    /* JADX INFO: renamed from: D7.a$a, reason: collision with other inner class name */
    public static final class C0018a {
        public /* synthetic */ C0018a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0018a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i10, WritableMap mEventData) {
        super(i10);
        Intrinsics.checkNotNullParameter(mEventData, "mEventData");
        this.f481a = mEventData;
    }

    @Override // com.facebook.react.uimanager.events.e
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.e
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), internal_getEventNameCompat(), this.f481a);
    }

    @Override // com.facebook.react.uimanager.events.e
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.e
    public String getEventName() {
        return "topLoadingSubResourceError";
    }
}
