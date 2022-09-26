// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.insights.ActivityLogAlertArgs;
import com.pulumi.azurenative.insights.outputs.ActionListResponse;
import com.pulumi.azurenative.insights.outputs.AlertRuleAllOfConditionResponse;
import com.pulumi.core.Alias;
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
 * An Activity Log Alert rule resource.
 * API Version: 2020-10-01.
 * 
 * ## Example Usage
 * ### Create or update an Activity Log Alert rule
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.insights.ActivityLogAlert;
 * import com.pulumi.azurenative.insights.ActivityLogAlertArgs;
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
 *         var activityLogAlert = new ActivityLogAlert(&#34;activityLogAlert&#34;, ActivityLogAlertArgs.builder()        
 *             .actions(Map.of(&#34;actionGroups&#34;, Map.ofEntries(
 *                 Map.entry(&#34;actionGroupId&#34;, &#34;/subscriptions/187f412d-1758-44d9-b052-169e2564721d/resourceGroups/MyResourceGroup/providers/Microsoft.Insights/actionGroups/SampleActionGroup&#34;),
 *                 Map.entry(&#34;webhookProperties&#34;, Map.of(&#34;sampleWebhookProperty&#34;, &#34;SamplePropertyValue&#34;))
 *             )))
 *             .activityLogAlertName(&#34;SampleActivityLogAlertRule&#34;)
 *             .condition(Map.of(&#34;allOf&#34;,             
 *                 Map.ofEntries(
 *                     Map.entry(&#34;equals&#34;, &#34;Administrative&#34;),
 *                     Map.entry(&#34;field&#34;, &#34;category&#34;)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;equals&#34;, &#34;Error&#34;),
 *                     Map.entry(&#34;field&#34;, &#34;level&#34;)
 *                 )))
 *             .description(&#34;Description of sample Activity Log Alert rule.&#34;)
 *             .enabled(true)
 *             .location(&#34;Global&#34;)
 *             .resourceGroupName(&#34;MyResourceGroup&#34;)
 *             .scopes(&#34;/subscriptions/187f412d-1758-44d9-b052-169e2564721d&#34;)
 *             .tags()
 *             .build());
 * 
 *     }
 * }
 * 
 * ```
 * ### Create or update an Activity Log Alert rule with &#39;anyOf&#39; condition
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.insights.ActivityLogAlert;
 * import com.pulumi.azurenative.insights.ActivityLogAlertArgs;
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
 *         var activityLogAlert = new ActivityLogAlert(&#34;activityLogAlert&#34;, ActivityLogAlertArgs.builder()        
 *             .actions(Map.of(&#34;actionGroups&#34;, Map.ofEntries(
 *                 Map.entry(&#34;actionGroupId&#34;, &#34;/subscriptions/187f412d-1758-44d9-b052-169e2564721d/resourceGroups/MyResourceGroup/providers/Microsoft.Insights/actionGroups/SampleActionGroup&#34;),
 *                 Map.entry(&#34;webhookProperties&#34;, Map.of(&#34;sampleWebhookProperty&#34;, &#34;SamplePropertyValue&#34;))
 *             )))
 *             .activityLogAlertName(&#34;SampleActivityLogAlertRuleWithAnyOfCondition&#34;)
 *             .condition(Map.of(&#34;allOf&#34;,             
 *                 Map.ofEntries(
 *                     Map.entry(&#34;equals&#34;, &#34;ServiceHealth&#34;),
 *                     Map.entry(&#34;field&#34;, &#34;category&#34;)
 *                 ),
 *                 Map.of(&#34;anyOf&#34;,                 
 *                     Map.ofEntries(
 *                         Map.entry(&#34;equals&#34;, &#34;Incident&#34;),
 *                         Map.entry(&#34;field&#34;, &#34;properties.incidentType&#34;)
 *                     ),
 *                     Map.ofEntries(
 *                         Map.entry(&#34;equals&#34;, &#34;Maintenance&#34;),
 *                         Map.entry(&#34;field&#34;, &#34;properties.incidentType&#34;)
 *                     ))))
 *             .description(&#34;Description of sample Activity Log Alert rule with &#39;anyOf&#39; condition.&#34;)
 *             .enabled(true)
 *             .location(&#34;Global&#34;)
 *             .resourceGroupName(&#34;MyResourceGroup&#34;)
 *             .scopes(&#34;subscriptions/187f412d-1758-44d9-b052-169e2564721d&#34;)
 *             .tags()
 *             .build());
 * 
 *     }
 * }
 * 
 * ```
 * ### Create or update an Activity Log Alert rule with &#39;containsAny&#39;
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.insights.ActivityLogAlert;
 * import com.pulumi.azurenative.insights.ActivityLogAlertArgs;
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
 *         var activityLogAlert = new ActivityLogAlert(&#34;activityLogAlert&#34;, ActivityLogAlertArgs.builder()        
 *             .actions(Map.of(&#34;actionGroups&#34;, Map.ofEntries(
 *                 Map.entry(&#34;actionGroupId&#34;, &#34;/subscriptions/187f412d-1758-44d9-b052-169e2564721d/resourceGroups/MyResourceGroup/providers/Microsoft.Insights/actionGroups/SampleActionGroup&#34;),
 *                 Map.entry(&#34;webhookProperties&#34;, Map.of(&#34;sampleWebhookProperty&#34;, &#34;SamplePropertyValue&#34;))
 *             )))
 *             .activityLogAlertName(&#34;SampleActivityLogAlertRuleWithContainsAny&#34;)
 *             .condition(Map.of(&#34;allOf&#34;,             
 *                 Map.ofEntries(
 *                     Map.entry(&#34;equals&#34;, &#34;ServiceHealth&#34;),
 *                     Map.entry(&#34;field&#34;, &#34;category&#34;)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;containsAny&#34;,                     
 *                         &#34;North Europe&#34;,
 *                         &#34;West Europe&#34;),
 *                     Map.entry(&#34;field&#34;, &#34;properties.impactedServices[*].ImpactedRegions[*].RegionName&#34;)
 *                 )))
 *             .description(&#34;Description of sample Activity Log Alert rule with &#39;containsAny&#39;.&#34;)
 *             .enabled(true)
 *             .location(&#34;Global&#34;)
 *             .resourceGroupName(&#34;MyResourceGroup&#34;)
 *             .scopes(&#34;subscriptions/187f412d-1758-44d9-b052-169e2564721d&#34;)
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
 * $ pulumi import azure-native:insights:ActivityLogAlert SampleActivityLogAlertRuleWithContainsAny /subscriptions/187f412d-1758-44d9-b052-169e2564721d/resourceGroups/MyResourceGroup/providers/microsoft.insights/activityLogAlerts/SampleActivityLogAlertRuleWithContainsAny 
 * ```
 * 
 */
@ResourceType(type="azure-native:insights:ActivityLogAlert")
public class ActivityLogAlert extends com.pulumi.resources.CustomResource {
    /**
     * The actions that will activate when the condition is met.
     * 
     */
    @Export(name="actions", type=ActionListResponse.class, parameters={})
    private Output<ActionListResponse> actions;

    /**
     * @return The actions that will activate when the condition is met.
     * 
     */
    public Output<ActionListResponse> actions() {
        return this.actions;
    }
    /**
     * The condition that will cause this alert to activate.
     * 
     */
    @Export(name="condition", type=AlertRuleAllOfConditionResponse.class, parameters={})
    private Output<AlertRuleAllOfConditionResponse> condition;

    /**
     * @return The condition that will cause this alert to activate.
     * 
     */
    public Output<AlertRuleAllOfConditionResponse> condition() {
        return this.condition;
    }
    /**
     * A description of this Activity Log Alert rule.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of this Activity Log Alert rule.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Indicates whether this Activity Log Alert rule is enabled. If an Activity Log Alert rule is not enabled, then none of its actions will be activated.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Indicates whether this Activity Log Alert rule is enabled. If an Activity Log Alert rule is not enabled, then none of its actions will be activated.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * The location of the resource. Since Azure Activity Log Alerts is a global service, the location of the rules should always be &#39;global&#39;.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location of the resource. Since Azure Activity Log Alerts is a global service, the location of the rules should always be &#39;global&#39;.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of resource IDs that will be used as prefixes. The alert will only apply to Activity Log events with resource IDs that fall under one of these prefixes. This list must include at least one item.
     * 
     */
    @Export(name="scopes", type=List.class, parameters={String.class})
    private Output<List<String>> scopes;

    /**
     * @return A list of resource IDs that will be used as prefixes. The alert will only apply to Activity Log events with resource IDs that fall under one of these prefixes. This list must include at least one item.
     * 
     */
    public Output<List<String>> scopes() {
        return this.scopes;
    }
    /**
     * The tags of the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The tags of the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ActivityLogAlert(String name) {
        this(name, ActivityLogAlertArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ActivityLogAlert(String name, ActivityLogAlertArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ActivityLogAlert(String name, ActivityLogAlertArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:ActivityLogAlert", name, args == null ? ActivityLogAlertArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ActivityLogAlert(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:ActivityLogAlert", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:insights/v20170401:ActivityLogAlert").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20201001:ActivityLogAlert").build())
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
    public static ActivityLogAlert get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ActivityLogAlert(name, id, options);
    }
}
