package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1356f0;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC7033c;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f15676a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f15677b = "target";

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15678a;

        static {
            int[] iArr = new int[y.values().length];
            try {
                iArr[y.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y.MOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[y.CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f15678a = iArr;
        }
    }

    private z() {
    }

    private final WritableMap[] a(w wVar) {
        MotionEvent motionEventD = wVar.d();
        WritableMap[] writableMapArr = new WritableMap[motionEventD.getPointerCount()];
        float x10 = motionEventD.getX() - wVar.f();
        float y9 = motionEventD.getY() - wVar.g();
        int pointerCount = motionEventD.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
            C1356f0 c1356f0 = C1356f0.f15679a;
            writableMapCreateMap.putDouble("pageX", c1356f0.e(motionEventD.getX(i10)));
            writableMapCreateMap.putDouble("pageY", c1356f0.e(motionEventD.getY(i10)));
            float x11 = motionEventD.getX(i10) - x10;
            float y10 = motionEventD.getY(i10) - y9;
            writableMapCreateMap.putDouble("locationX", c1356f0.e(x11));
            writableMapCreateMap.putDouble("locationY", c1356f0.e(y10));
            writableMapCreateMap.putInt("targetSurface", wVar.getSurfaceId());
            writableMapCreateMap.putInt(f15677b, wVar.getViewTag());
            writableMapCreateMap.putDouble("timestamp", wVar.getTimestampMs());
            writableMapCreateMap.putDouble("identifier", motionEventD.getPointerId(i10));
            writableMapArr[i10] = writableMapCreateMap;
        }
        return writableMapArr;
    }

    private final WritableArray b(boolean z9, WritableMap[] writableMapArr) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Intrinsics.checkNotNullExpressionValue(writableArrayCreateArray, "createArray(...)");
        for (WritableMap writableMapCopy : writableMapArr) {
            if (writableMapCopy != null) {
                if (z9) {
                    writableMapCopy = writableMapCopy.copy();
                }
                writableArrayCreateArray.pushMap(writableMapCopy);
            }
        }
        return writableArrayCreateArray;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a1 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:3:0x002d, B:11:0x0051, B:31:0x0097, B:32:0x009b, B:34:0x00a1, B:36:0x00a9, B:38:0x00c4, B:14:0x0059, B:15:0x005e, B:16:0x005f, B:17:0x0062, B:19:0x0065, B:21:0x0069, B:23:0x006f, B:25:0x0076, B:26:0x0083, B:28:0x008b, B:30:0x0091), top: B:44:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:3:0x002d, B:11:0x0051, B:31:0x0097, B:32:0x009b, B:34:0x00a1, B:36:0x00a9, B:38:0x00c4, B:14:0x0059, B:15:0x005e, B:16:0x005f, B:17:0x0062, B:19:0x0065, B:21:0x0069, B:23:0x006f, B:25:0x0076, B:26:0x0083, B:28:0x008b, B:30:0x0091), top: B:44:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    public static final void c(RCTModernEventEmitter rCTModernEventEmitter, w event) {
        WritableMap[] writableMapArr;
        WritableMap[] writableMapArr2;
        Iterator itA;
        WritableMap writableMap;
        WritableMap writableMap2;
        RCTModernEventEmitter eventEmitter = rCTModernEventEmitter;
        Intrinsics.checkNotNullParameter(eventEmitter, "eventEmitter");
        Intrinsics.checkNotNullParameter(event, "event");
        p065g4.a.c(0L, "TouchesHelper.sentTouchEventModern(" + event.getEventName() + ")");
        try {
            y yVarE = event.e();
            MotionEvent motionEventD = event.d();
            WritableMap[] writableMapArrA = f15676a.a(event);
            int i10 = a.f15678a[yVarE.ordinal()];
            if (i10 == 1) {
                WritableMap writableMap3 = writableMapArrA[motionEventD.getActionIndex()];
                writableMapArr = new WritableMap[]{writableMap3 != null ? writableMap3.copy() : null};
            } else {
                if (i10 != 2) {
                    if (i10 == 3) {
                        writableMapArr = new WritableMap[writableMapArrA.length];
                        for (int i11 = 0; i11 < writableMapArrA.length; i11++) {
                            WritableMap writableMap4 = writableMapArrA[i11];
                            writableMapArr[i11] = writableMap4 != null ? writableMap4.copy() : null;
                        }
                    } else {
                        if (i10 != 4) {
                            throw new p129m8.k();
                        }
                        writableMapArr2 = new WritableMap[0];
                        writableMapArr = writableMapArrA;
                    }
                    itA = AbstractC7033c.a(writableMapArr);
                    while (itA.hasNext()) {
                        writableMap = (WritableMap) itA.next();
                        if (writableMap != null) {
                            WritableMap writableMapCopy = writableMap.copy();
                            z zVar = f15676a;
                            WritableArray writableArrayB = zVar.b(true, writableMapArr);
                            WritableArray writableArrayB2 = zVar.b(true, writableMapArr2);
                            writableMapCopy.putArray("changedTouches", writableArrayB);
                            writableMapCopy.putArray("touches", writableArrayB2);
                            writableMap2 = writableMapCopy;
                        } else {
                            writableMap2 = null;
                        }
                        eventEmitter.receiveEvent(event.getSurfaceId(), event.getViewTag(), event.getEventName(), event.canCoalesce(), 0, writableMap2, event.getEventCategory());
                        eventEmitter = rCTModernEventEmitter;
                    }
                    p065g4.a.i(0L);
                }
                int actionIndex = motionEventD.getActionIndex();
                WritableMap writableMap5 = writableMapArrA[actionIndex];
                writableMapArrA[actionIndex] = null;
                writableMapArr = new WritableMap[]{writableMap5};
            }
            writableMapArr2 = writableMapArrA;
            itA = AbstractC7033c.a(writableMapArr);
            while (itA.hasNext()) {
                writableMap = (WritableMap) itA.next();
                if (writableMap != null) {
                    WritableMap writableMapCopy2 = writableMap.copy();
                    z zVar2 = f15676a;
                    WritableArray writableArrayB3 = zVar2.b(true, writableMapArr);
                    WritableArray writableArrayB4 = zVar2.b(true, writableMapArr2);
                    writableMapCopy2.putArray("changedTouches", writableArrayB3);
                    writableMapCopy2.putArray("touches", writableArrayB4);
                    writableMap2 = writableMapCopy2;
                } else {
                    writableMap2 = null;
                }
                eventEmitter.receiveEvent(event.getSurfaceId(), event.getViewTag(), event.getEventName(), event.canCoalesce(), 0, writableMap2, event.getEventCategory());
                eventEmitter = rCTModernEventEmitter;
            }
            p065g4.a.i(0L);
        } catch (Throwable th) {
            p065g4.a.i(0L);
            throw th;
        }
    }

    public static final void d(RCTEventEmitter rctEventEmitter, w touchEvent) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        Intrinsics.checkNotNullParameter(touchEvent, "touchEvent");
        y yVarE = touchEvent.e();
        z zVar = f15676a;
        WritableArray writableArrayB = zVar.b(false, zVar.a(touchEvent));
        MotionEvent motionEventD = touchEvent.d();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Intrinsics.checkNotNullExpressionValue(writableArrayCreateArray, "createArray(...)");
        if (yVarE == y.MOVE || yVarE == y.CANCEL) {
            int pointerCount = motionEventD.getPointerCount();
            for (int i10 = 0; i10 < pointerCount; i10++) {
                writableArrayCreateArray.pushInt(i10);
            }
        } else {
            if (yVarE != y.START && yVarE != y.END) {
                throw new RuntimeException("Unknown touch type: " + yVarE);
            }
            writableArrayCreateArray.pushInt(motionEventD.getActionIndex());
        }
        rctEventEmitter.receiveTouches(y.f15668b.a(yVarE), writableArrayB, writableArrayCreateArray);
    }
}
