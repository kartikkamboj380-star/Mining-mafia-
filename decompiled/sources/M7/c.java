package M7;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends com.facebook.react.uimanager.events.e implements K7.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3534a = new a(null);

    public static final class a implements K7.c {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // K7.c
        public String a() {
            return "onWillAppear";
        }

        @Override // K7.c
        public String getEventName() {
            return "topWillAppear";
        }

        private a() {
        }
    }

    public c(int i10, int i11) {
        super(i10, i11);
    }

    @Override // K7.c
    public String a() {
        return "onWillAppear";
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
        return "topWillAppear";
    }
}
