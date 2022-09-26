// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.insights.ScheduledQueryRuleArgs;
import com.pulumi.azurenative.insights.outputs.AlertingActionResponse;
import com.pulumi.azurenative.insights.outputs.LogToMetricActionResponse;
import com.pulumi.azurenative.insights.outputs.ScheduleResponse;
import com.pulumi.azurenative.insights.outputs.SourceResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The Log Search Rule resource.
 * API Version: 2018-04-16.
 * 
 * ## Example Usage
 * ### Create or Update rule - AlertingAction
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.insights.ScheduledQueryRule;
 * import com.pulumi.azurenative.insights.ScheduledQueryRuleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var scheduledQueryRule = new ScheduledQueryRule(&#34;scheduledQueryRule&#34;, ScheduledQueryRuleArgs.builder()        
 *             .action(Map.ofEntries(
 *                 Map.entry(&#34;aznsAction&#34;, Map.ofEntries(
 *                     Map.entry(&#34;actionGroup&#34;, ),
 *                     Map.entry(&#34;customWebhookPayload&#34;, &#34;{}&#34;),
 *                     Map.entry(&#34;emailSubject&#34;, &#34;Email Header&#34;)
 *                 )),
 *                 Map.entry(&#34;odataType&#34;, &#34;Microsoft.WindowsAzure.Management.Monitoring.Alerts.Models.Microsoft.AppInsights.Nexus.DataContracts.Resources.ScheduledQueryRules.AlertingAction&#34;),
 *                 Map.entry(&#34;severity&#34;, &#34;1&#34;),
 *                 Map.entry(&#34;trigger&#34;, Map.ofEntries(
 *                     Map.entry(&#34;metricTrigger&#34;, Map.ofEntries(
 *                         Map.entry(&#34;metricColumn&#34;, &#34;Computer&#34;),
 *                         Map.entry(&#34;metricTriggerType&#34;, &#34;Consecutive&#34;),
 *                         Map.entry(&#34;threshold&#34;, 5),
 *                         Map.entry(&#34;thresholdOperator&#34;, &#34;GreaterThan&#34;)
 *                     )),
 *                     Map.entry(&#34;threshold&#34;, 3),
 *                     Map.entry(&#34;thresholdOperator&#34;, &#34;GreaterThan&#34;)
 *                 ))
 *             ))
 *             .description(&#34;log alert description&#34;)
 *             .enabled(&#34;true&#34;)
 *             .location(&#34;eastus&#34;)
 *             .resourceGroupName(&#34;Rac46PostSwapRG&#34;)
 *             .ruleName(&#34;logalertfoo&#34;)
 *             .schedule(Map.ofEntries(
 *                 Map.entry(&#34;frequencyInMinutes&#34;, 15),
 *                 Map.entry(&#34;timeWindowInMinutes&#34;, 15)
 *             ))
 *             .source(Map.ofEntries(
 *                 Map.entry(&#34;dataSourceId&#34;, &#34;/subscriptions/b67f7fec-69fc-4974-9099-a26bd6ffeda3/resourceGroups/Rac46PostSwapRG/providers/Microsoft.OperationalInsights/workspaces/sampleWorkspace&#34;),
 *                 Map.entry(&#34;query&#34;, &#34;Heartbeat | summarize AggregatedValue = count() by bin(TimeGenerated, 5m)&#34;),
 *                 Map.entry(&#34;queryType&#34;, &#34;ResultCount&#34;)
 *             ))
 *             .tags()
 *             .build());
 * 
 *     }
 * }
 * 
 * ```
 * ### Create or Update rule - AlertingAction with Cross-Resource
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.insights.ScheduledQueryRule;
 * import com.pulumi.azurenative.insights.ScheduledQueryRuleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var scheduledQueryRule = new ScheduledQueryRule(&#34;scheduledQueryRule&#34;, ScheduledQueryRuleArgs.builder()        
 *             .action(Map.ofEntries(
 *                 Map.entry(&#34;aznsAction&#34;, Map.ofEntries(
 *                     Map.entry(&#34;actionGroup&#34;, &#34;/subscriptions/b67f7fec-69fc-4974-9099-a26bd6ffeda3/resourceGroups/Rac46PostSwapRG/providers/microsoft.insights/actiongroups/test-ag&#34;),
 *                     Map.entry(&#34;emailSubject&#34;, &#34;Cross Resource Mail!!&#34;)
 *                 )),
 *                 Map.entry(&#34;odataType&#34;, &#34;Microsoft.WindowsAzure.Management.Monitoring.Alerts.Models.Microsoft.AppInsights.Nexus.DataContracts.Resources.ScheduledQueryRules.AlertingAction&#34;),
 *                 Map.entry(&#34;severity&#34;, &#34;3&#34;),
 *                 Map.entry(&#34;trigger&#34;, Map.ofEntries(
 *                     Map.entry(&#34;threshold&#34;, 5000),
 *                     Map.entry(&#34;thresholdOperator&#34;, &#34;GreaterThan&#34;)
 *                 ))
 *             ))
 *             .description(&#34;Sample Cross Resource alert&#34;)
 *             .enabled(&#34;true&#34;)
 *             .location(&#34;eastus&#34;)
 *             .resourceGroupName(&#34;Rac46PostSwapRG&#34;)
 *             .ruleName(&#34;SampleCrossResourceAlert&#34;)
 *             .schedule(Map.ofEntries(
 *                 Map.entry(&#34;frequencyInMinutes&#34;, 60),
 *                 Map.entry(&#34;timeWindowInMinutes&#34;, 60)
 *             ))
 *             .source(Map.ofEntries(
 *                 Map.entry(&#34;authorizedResources&#34;,                 
 *                     &#34;/subscriptions/b67f7fec-69fc-4974-9099-a26bd6ffeda3/resourceGroups/Rac46PostSwapRG/providers/Microsoft.OperationalInsights/workspaces/sampleWorkspace&#34;,
 *                     &#34;/subscriptions/b67f7fec-69fc-4974-9099-a26bd6ffeda3/resourceGroups/Rac46PostSwapRG/providers/microsoft.insights/components/sampleAI&#34;),
 *                 Map.entry(&#34;dataSourceId&#34;, &#34;/subscriptions/b67f7fec-69fc-4974-9099-a26bd6ffeda3/resourceGroups/Rac46PostSwapRG/providers/microsoft.insights/components/sampleAI&#34;),
 *                 Map.entry(&#34;query&#34;, &#34;union requests, workspace(\&#34;sampleWorkspace\&#34;).Update&#34;),
 *                 Map.entry(&#34;queryType&#34;, &#34;ResultCount&#34;)
 *             ))
 *             .tags()
 *             .build());
 * 
 *     }
 * }
 * 
 * ```
 * ### Create or Update rule - LogToMetricAction
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.insights.ScheduledQueryRule;
 * import com.pulumi.azurenative.insights.ScheduledQueryRuleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var scheduledQueryRule = new ScheduledQueryRule(&#34;scheduledQueryRule&#34;, ScheduledQueryRuleArgs.builder()        
 *             .action(Map.ofEntries(
 *                 Map.entry(&#34;criteria&#34;, Map.ofEntries(
 *                     Map.entry(&#34;dimensions&#34;, ),
 *                     Map.entry(&#34;metricName&#34;, &#34;Average_% Idle Time&#34;)
 *                 )),
 *                 Map.entry(&#34;odataType&#34;, &#34;Microsoft.WindowsAzure.Management.Monitoring.Alerts.Models.Microsoft.AppInsights.Nexus.DataContracts.Resources.ScheduledQueryRules.LogToMetricAction&#34;)
 *             ))
 *             .description(&#34;log to metric description&#34;)
 *             .enabled(&#34;true&#34;)
 *             .location(&#34;West Europe&#34;)
 *             .resourceGroupName(&#34;alertsweu&#34;)
 *             .ruleName(&#34;logtometricfoo&#34;)
 *             .source(Map.of(&#34;dataSourceId&#34;, &#34;/subscriptions/af52d502-a447-4bc6-8cb7-4780fbb00490/resourceGroups/alertsweu/providers/Microsoft.OperationalInsights/workspaces/alertsweu&#34;))
 *             .tags()
 *             .build());
 * 
 *     }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:insights:ScheduledQueryRule logtometricfoo /subscriptions/af52d502-a447-4bc6-8cb7-4780fbb00490/resourceGroups/alertsweu/providers/microsoft.insights/scheduledqueryrules/logtometricfoo 
 * ```
 * 
 */
@ResourceType(type="azure-native:insights:ScheduledQueryRule")
public class ScheduledQueryRule extends com.pulumi.resources.CustomResource {
    /**
     * Action needs to be taken on rule execution.
     * 
     */
    @Export(name="action", type=Either.class, parameters={AlertingActionResponse.class, LogToMetricActionResponse.class})
    private Output<Either<AlertingActionResponse,LogToMetricActionResponse>> action;

    /**
     * @return Action needs to be taken on rule execution.
     * 
     */
    public Output<Either<AlertingActionResponse,LogToMetricActionResponse>> action() {
        return this.action;
    }
    /**
     * The flag that indicates whether the alert should be automatically resolved or not. The default is false.
     * 
     */
    @Export(name="autoMitigate", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoMitigate;

    /**
     * @return The flag that indicates whether the alert should be automatically resolved or not. The default is false.
     * 
     */
    public Output<Optional<Boolean>> autoMitigate() {
        return Codegen.optional(this.autoMitigate);
    }
    /**
     * The api-version used when creating this alert rule
     * 
     */
    @Export(name="createdWithApiVersion", type=String.class, parameters={})
    private Output<String> createdWithApiVersion;

    /**
     * @return The api-version used when creating this alert rule
     * 
     */
    public Output<String> createdWithApiVersion() {
        return this.createdWithApiVersion;
    }
    /**
     * The description of the Log Search rule.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the Log Search rule.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The display name of the alert rule
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The display name of the alert rule
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * The flag which indicates whether the Log Search rule is enabled. Value should be true or false
     * 
     */
    @Export(name="enabled", type=String.class, parameters={})
    private Output</* @Nullable */ String> enabled;

    /**
     * @return The flag which indicates whether the Log Search rule is enabled. Value should be true or false
     * 
     */
    public Output<Optional<String>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * The etag field is *not* required. If it is provided in the response body, it must also be provided as a header per the normal etag convention.  Entity tags are used for comparing two or more entities from the same requested resource. HTTP/1.1 uses entity tags in the etag (section 14.19), If-Match (section 14.24), If-None-Match (section 14.26), and If-Range (section 14.27) header fields.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return The etag field is *not* required. If it is provided in the response body, it must also be provided as a header per the normal etag convention.  Entity tags are used for comparing two or more entities from the same requested resource. HTTP/1.1 uses entity tags in the etag (section 14.19), If-Match (section 14.24), If-None-Match (section 14.26), and If-Range (section 14.27) header fields.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * True if alert rule is legacy Log Analytic rule
     * 
     */
    @Export(name="isLegacyLogAnalyticsRule", type=Boolean.class, parameters={})
    private Output<Boolean> isLegacyLogAnalyticsRule;

    /**
     * @return True if alert rule is legacy Log Analytic rule
     * 
     */
    public Output<Boolean> isLegacyLogAnalyticsRule() {
        return this.isLegacyLogAnalyticsRule;
    }
    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Last time the rule was updated in IS08601 format.
     * 
     */
    @Export(name="lastUpdatedTime", type=String.class, parameters={})
    private Output<String> lastUpdatedTime;

    /**
     * @return Last time the rule was updated in IS08601 format.
     * 
     */
    public Output<String> lastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Azure resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Provisioning state of the scheduled query rule
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the scheduled query rule
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Schedule (Frequency, Time Window) for rule. Required for action type - AlertingAction
     * 
     */
    @Export(name="schedule", type=ScheduleResponse.class, parameters={})
    private Output</* @Nullable */ ScheduleResponse> schedule;

    /**
     * @return Schedule (Frequency, Time Window) for rule. Required for action type - AlertingAction
     * 
     */
    public Output<Optional<ScheduleResponse>> schedule() {
        return Codegen.optional(this.schedule);
    }
    /**
     * Data Source against which rule will Query Data
     * 
     */
    @Export(name="source", type=SourceResponse.class, parameters={})
    private Output<SourceResponse> source;

    /**
     * @return Data Source against which rule will Query Data
     * 
     */
    public Output<SourceResponse> source() {
        return this.source;
    }
    /**
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Azure resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ScheduledQueryRule(String name) {
        this(name, ScheduledQueryRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ScheduledQueryRule(String name, ScheduledQueryRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ScheduledQueryRule(String name, ScheduledQueryRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:ScheduledQueryRule", name, args == null ? ScheduledQueryRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ScheduledQueryRule(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:ScheduledQueryRule", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:insights/v20180416:ScheduledQueryRule").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20200501preview:ScheduledQueryRule").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20210201preview:ScheduledQueryRule").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20210801:ScheduledQueryRule").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20220615:ScheduledQueryRule").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ScheduledQueryRule get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ScheduledQueryRule(name, id, options);
    }
}