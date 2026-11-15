package com.tenjin.android.userprofile;

import com.google.gson.e;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p098j7.c;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public final class UserProfileData {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @c("iap_revenue_by_currency")
    @NotNull
    private final Map<String, Double> _iapRevenueByCurrency = new LinkedHashMap();

    @c("ilrd_revenue_by_network")
    @NotNull
    private final Map<String, Double> _ilrdRevenueByNetwork = new LinkedHashMap();

    @c("purchased_product_ids")
    @NotNull
    private final Set<String> _purchasedProductIDs = new LinkedHashSet();

    @c("current_session_paused_time")
    private volatile long currentSessionPausedTime;

    @c("current_session_start_time")
    @Nullable
    private volatile Long currentSessionStartTime;

    @c("first_session_date")
    @Nullable
    private volatile Long firstSessionDate;

    @c("iap_transaction_count")
    private volatile int iapTransactionCount;

    @c("last_background_time")
    @Nullable
    private volatile Long lastBackgroundTime;

    @c("last_session_date")
    @Nullable
    private volatile Long lastSessionDate;

    @c("last_session_length")
    private volatile long lastSessionLength;

    @c("session_count")
    private volatile int sessionCount;

    @c("total_ilrd_revenue_usd")
    private volatile double totalILRDRevenueUSD;

    @c("total_session_time")
    private volatile long totalSessionTime;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UserProfileData fromJson(@Nullable String str) {
            if (str == null || str.length() == 0) {
                return new UserProfileData();
            }
            try {
                Object objI = new e().i(str, UserProfileData.class);
                Intrinsics.c(objI);
                return (UserProfileData) objI;
            } catch (Exception unused) {
                return new UserProfileData();
            }
        }

        private Companion() {
        }
    }

    private final void endBackgroundedSession() {
        synchronized (this) {
            try {
                Long l10 = this.currentSessionStartTime;
                Long l11 = this.lastBackgroundTime;
                if (l10 != null && l11 != null) {
                    long jMax = Math.max(0L, (l11.longValue() - l10.longValue()) - this.currentSessionPausedTime);
                    this.totalSessionTime += jMax;
                    this.lastSessionLength = jMax;
                    this.lastSessionDate = l11;
                    this.currentSessionStartTime = null;
                    this.lastBackgroundTime = null;
                    this.currentSessionPausedTime = 0L;
                }
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final String formatISO8601(long j10) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(new Date(j10));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public static final UserProfileData fromJson(@Nullable String str) {
        return Companion.fromJson(str);
    }

    @Nullable
    public final Unit endSession() {
        Unit unit;
        synchronized (this) {
            unit = null;
            if (this.currentSessionStartTime != null) {
                long currentSessionDuration = getCurrentSessionDuration();
                this.totalSessionTime += currentSessionDuration;
                this.lastSessionLength = currentSessionDuration;
                this.lastSessionDate = Long.valueOf(System.currentTimeMillis());
                this.currentSessionStartTime = null;
                this.lastBackgroundTime = null;
                this.currentSessionPausedTime = 0L;
                unit = Unit.f45918a;
            }
        }
        return unit;
    }

    public final long getAverageSessionLength() {
        long totalSessionTimeIncludingCurrent;
        synchronized (this) {
            totalSessionTimeIncludingCurrent = this.sessionCount == 0 ? 0L : getTotalSessionTimeIncludingCurrent() / ((long) this.sessionCount);
        }
        return totalSessionTimeIncludingCurrent;
    }

    public final long getCurrentSessionDuration() {
        synchronized (this) {
            try {
                Long l10 = this.currentSessionStartTime;
                if (l10 == null) {
                    return 0L;
                }
                long jLongValue = l10.longValue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                Long l11 = this.lastBackgroundTime;
                if (l11 != null) {
                    jCurrentTimeMillis = l11.longValue();
                }
                return Math.max(0L, (jCurrentTimeMillis - jLongValue) - this.currentSessionPausedTime);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public final Long getFirstSessionDate() {
        return this.firstSessionDate;
    }

    @NotNull
    public final Map<String, Double> getIapRevenueByCurrency() {
        Map<String, Double> mapT;
        synchronized (this) {
            mapT = E.t(this._iapRevenueByCurrency);
        }
        return mapT;
    }

    public final int getIapTransactionCount() {
        return this.iapTransactionCount;
    }

    @NotNull
    public final Map<String, Double> getIlrdRevenueByNetwork() {
        Map<String, Double> mapT;
        synchronized (this) {
            mapT = E.t(this._ilrdRevenueByNetwork);
        }
        return mapT;
    }

    @Nullable
    public final Long getLastSessionDate() {
        return this.lastSessionDate;
    }

    public final long getLastSessionLength() {
        return this.lastSessionLength;
    }

    @NotNull
    public final List<String> getPurchasedProductIDs() {
        List<String> listQ0;
        synchronized (this) {
            listQ0 = CollectionsKt.q0(this._purchasedProductIDs);
        }
        return listQ0;
    }

    public final int getSessionCount() {
        return this.sessionCount;
    }

    public final double getTotalILRDRevenueUSD() {
        return this.totalILRDRevenueUSD;
    }

    public final long getTotalSessionTime() {
        return this.totalSessionTime;
    }

    public final long getTotalSessionTimeIncludingCurrent() {
        long currentSessionDuration;
        synchronized (this) {
            currentSessionDuration = this.totalSessionTime + getCurrentSessionDuration();
        }
        return currentSessionDuration;
    }

    public final void pauseSession() {
        synchronized (this) {
            this.lastBackgroundTime = Long.valueOf(System.currentTimeMillis());
            Unit unit = Unit.f45918a;
        }
    }

    @Nullable
    public final Boolean recordIAPTransaction(@Nullable String str, @Nullable String str2, double d10) {
        Boolean boolValueOf;
        synchronized (this) {
            try {
                this.iapTransactionCount++;
                boolValueOf = null;
                if (str2 != null) {
                    if (str2.length() <= 0) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        Locale US = Locale.US;
                        Intrinsics.checkNotNullExpressionValue(US, "US");
                        String upperCase = str2.toUpperCase(US);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                        Map<String, Double> map = this._iapRevenueByCurrency;
                        map.put(upperCase, Double.valueOf(map.getOrDefault(upperCase, Double.valueOf(0.0d)).doubleValue() + d10));
                    }
                }
                if (str != null) {
                    if (str.length() <= 0) {
                        str = null;
                    }
                    if (str != null) {
                        boolValueOf = Boolean.valueOf(this._purchasedProductIDs.add(str));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return boolValueOf;
    }

    @Nullable
    public final Unit recordILRDRevenue(@Nullable String str, double d10) {
        Unit unit;
        synchronized (this) {
            this.totalILRDRevenueUSD += d10;
            unit = null;
            if (str != null) {
                if (str.length() <= 0) {
                    str = null;
                }
                if (str != null) {
                    Map<String, Double> map = this._ilrdRevenueByNetwork;
                    map.put(str, Double.valueOf(map.getOrDefault(str, Double.valueOf(0.0d)).doubleValue() + d10));
                    unit = Unit.f45918a;
                }
            }
        }
        return unit;
    }

    public final void resumeOrStartSession(long j10) {
        synchronized (this) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long l10 = this.lastBackgroundTime;
            if (l10 != null) {
                long jLongValue = jCurrentTimeMillis - l10.longValue();
                if (jLongValue < j10) {
                    this.currentSessionPausedTime += jLongValue;
                    this.lastBackgroundTime = null;
                    return;
                }
                endBackgroundedSession();
            }
            this.currentSessionStartTime = Long.valueOf(jCurrentTimeMillis);
            this.sessionCount++;
            this.lastBackgroundTime = null;
            this.currentSessionPausedTime = 0L;
            if (this.firstSessionDate == null) {
                this.firstSessionDate = Long.valueOf(jCurrentTimeMillis);
            }
            Unit unit = Unit.f45918a;
        }
    }

    @NotNull
    public final Map<String, Object> toDictionary() {
        LinkedHashMap linkedHashMap;
        synchronized (this) {
            try {
                linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("session_count", Integer.valueOf(this.sessionCount));
                linkedHashMap.put("total_session_time", Long.valueOf(this.totalSessionTime));
                linkedHashMap.put("average_session_length", Long.valueOf(getAverageSessionLength()));
                linkedHashMap.put("last_session_length", Long.valueOf(this.lastSessionLength));
                linkedHashMap.put("iap_transaction_count", Integer.valueOf(this.iapTransactionCount));
                linkedHashMap.put("total_ilrd_revenue_usd", Double.valueOf(this.totalILRDRevenueUSD));
                Long l10 = this.firstSessionDate;
                if (l10 != null) {
                    linkedHashMap.put("first_session_date", formatISO8601(l10.longValue()));
                }
                Long l11 = this.lastSessionDate;
                if (l11 != null) {
                    linkedHashMap.put("last_session_date", formatISO8601(l11.longValue()));
                }
                if (this.currentSessionStartTime != null) {
                    linkedHashMap.put("current_session_length", Long.valueOf(getCurrentSessionDuration()));
                }
                if (!this._iapRevenueByCurrency.isEmpty()) {
                    linkedHashMap.put("iap_revenue_by_currency", E.t(this._iapRevenueByCurrency));
                }
                if (!this._ilrdRevenueByNetwork.isEmpty()) {
                    linkedHashMap.put("ilrd_revenue_by_network", E.t(this._ilrdRevenueByNetwork));
                }
                if (!this._purchasedProductIDs.isEmpty()) {
                    linkedHashMap.put("purchased_product_ids", CollectionsKt.q0(this._purchasedProductIDs));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public final String toJson() {
        String strS;
        synchronized (this) {
            strS = new e().s(this);
        }
        Intrinsics.checkNotNullExpressionValue(strS, "synchronized(...)");
        return strS;
    }

    @NotNull
    public final Map<String, String> toScalarMap() {
        LinkedHashMap linkedHashMap;
        synchronized (this) {
            try {
                linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("session_count", String.valueOf(this.sessionCount));
                linkedHashMap.put("total_session_time", String.valueOf(getTotalSessionTimeIncludingCurrent()));
                linkedHashMap.put("average_session_length", String.valueOf(getAverageSessionLength()));
                linkedHashMap.put("last_session_length", String.valueOf(this.lastSessionLength));
                linkedHashMap.put("iap_transaction_count", String.valueOf(this.iapTransactionCount));
                linkedHashMap.put("total_ilrd_revenue_usd", String.valueOf(this.totalILRDRevenueUSD));
                Long l10 = this.firstSessionDate;
                if (l10 != null) {
                    linkedHashMap.put("first_session_date", formatISO8601(l10.longValue()));
                }
                Long l11 = this.lastSessionDate;
                if (l11 != null) {
                    linkedHashMap.put("last_session_date", formatISO8601(l11.longValue()));
                }
                if (this.currentSessionStartTime != null) {
                    linkedHashMap.put("current_session_length", String.valueOf(getCurrentSessionDuration()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedHashMap;
    }
}
