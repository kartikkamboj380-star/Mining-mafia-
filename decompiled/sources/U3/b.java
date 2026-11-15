package U3;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static Integer[] a(Integer[] edgeColors) {
        Intrinsics.checkNotNullParameter(edgeColors, "edgeColors");
        return edgeColors;
    }

    public static /* synthetic */ Integer[] b(Integer[] numArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            numArr = new Integer[o.values().length];
        }
        return a(numArr);
    }

    public static final h c(Integer[] numArr, int i10, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int iIntValue = -16777216;
        if (i10 == 0) {
            Integer num = numArr[o.START.ordinal()];
            int iIntValue2 = (num == null && (num = numArr[o.LEFT.ordinal()]) == null && (num = numArr[o.HORIZONTAL.ordinal()]) == null && (num = numArr[o.ALL.ordinal()]) == null) ? -16777216 : num.intValue();
            Integer num2 = numArr[o.BLOCK_START.ordinal()];
            int iIntValue3 = (num2 == null && (num2 = numArr[o.TOP.ordinal()]) == null && (num2 = numArr[o.BLOCK.ordinal()]) == null && (num2 = numArr[o.VERTICAL.ordinal()]) == null && (num2 = numArr[o.ALL.ordinal()]) == null) ? -16777216 : num2.intValue();
            Integer num3 = numArr[o.END.ordinal()];
            int iIntValue4 = (num3 == null && (num3 = numArr[o.RIGHT.ordinal()]) == null && (num3 = numArr[o.HORIZONTAL.ordinal()]) == null && (num3 = numArr[o.ALL.ordinal()]) == null) ? -16777216 : num3.intValue();
            Integer num4 = numArr[o.BLOCK_END.ordinal()];
            if (num4 == null && (num4 = numArr[o.BOTTOM.ordinal()]) == null && (num4 = numArr[o.BLOCK.ordinal()]) == null && (num4 = numArr[o.VERTICAL.ordinal()]) == null) {
                Integer num5 = numArr[o.ALL.ordinal()];
                if (num5 != null) {
                    iIntValue = num5.intValue();
                }
            } else {
                iIntValue = num4.intValue();
            }
            return new h(iIntValue2, iIntValue3, iIntValue4, iIntValue);
        }
        if (i10 != 1) {
            throw new IllegalArgumentException("Expected resolved layout direction");
        }
        if (com.facebook.react.modules.i18nmanager.a.f14969a.a().d(context)) {
            Integer num6 = numArr[o.END.ordinal()];
            int iIntValue5 = (num6 == null && (num6 = numArr[o.RIGHT.ordinal()]) == null && (num6 = numArr[o.HORIZONTAL.ordinal()]) == null && (num6 = numArr[o.ALL.ordinal()]) == null) ? -16777216 : num6.intValue();
            Integer num7 = numArr[o.BLOCK_START.ordinal()];
            int iIntValue6 = (num7 == null && (num7 = numArr[o.TOP.ordinal()]) == null && (num7 = numArr[o.BLOCK.ordinal()]) == null && (num7 = numArr[o.VERTICAL.ordinal()]) == null && (num7 = numArr[o.ALL.ordinal()]) == null) ? -16777216 : num7.intValue();
            Integer num8 = numArr[o.START.ordinal()];
            int iIntValue7 = (num8 == null && (num8 = numArr[o.LEFT.ordinal()]) == null && (num8 = numArr[o.HORIZONTAL.ordinal()]) == null && (num8 = numArr[o.ALL.ordinal()]) == null) ? -16777216 : num8.intValue();
            Integer num9 = numArr[o.BLOCK_END.ordinal()];
            if (num9 == null && (num9 = numArr[o.BOTTOM.ordinal()]) == null && (num9 = numArr[o.BLOCK.ordinal()]) == null && (num9 = numArr[o.VERTICAL.ordinal()]) == null) {
                Integer num10 = numArr[o.ALL.ordinal()];
                if (num10 != null) {
                    iIntValue = num10.intValue();
                }
            } else {
                iIntValue = num9.intValue();
            }
            return new h(iIntValue5, iIntValue6, iIntValue7, iIntValue);
        }
        Integer num11 = numArr[o.END.ordinal()];
        int iIntValue8 = (num11 == null && (num11 = numArr[o.LEFT.ordinal()]) == null && (num11 = numArr[o.HORIZONTAL.ordinal()]) == null && (num11 = numArr[o.ALL.ordinal()]) == null) ? -16777216 : num11.intValue();
        Integer num12 = numArr[o.BLOCK_START.ordinal()];
        int iIntValue9 = (num12 == null && (num12 = numArr[o.TOP.ordinal()]) == null && (num12 = numArr[o.BLOCK.ordinal()]) == null && (num12 = numArr[o.VERTICAL.ordinal()]) == null && (num12 = numArr[o.ALL.ordinal()]) == null) ? -16777216 : num12.intValue();
        Integer num13 = numArr[o.START.ordinal()];
        int iIntValue10 = (num13 == null && (num13 = numArr[o.RIGHT.ordinal()]) == null && (num13 = numArr[o.HORIZONTAL.ordinal()]) == null && (num13 = numArr[o.ALL.ordinal()]) == null) ? -16777216 : num13.intValue();
        Integer num14 = numArr[o.BLOCK_END.ordinal()];
        if (num14 == null && (num14 = numArr[o.BOTTOM.ordinal()]) == null && (num14 = numArr[o.BLOCK.ordinal()]) == null && (num14 = numArr[o.VERTICAL.ordinal()]) == null) {
            Integer num15 = numArr[o.ALL.ordinal()];
            if (num15 != null) {
                iIntValue = num15.intValue();
            }
        } else {
            iIntValue = num14.intValue();
        }
        return new h(iIntValue8, iIntValue9, iIntValue10, iIntValue);
    }
}
