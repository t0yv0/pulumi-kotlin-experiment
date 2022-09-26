// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.sql.JobTargetGroupArgs;
import com.pulumi.azurenative.sql.outputs.JobTargetResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A group of job targets.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * ### Create or update a target group with all properties.
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.sql.JobTargetGroup;
 * import com.pulumi.azurenative.sql.JobTargetGroupArgs;
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
 *         var jobTargetGroup = new JobTargetGroup(&#34;jobTargetGroup&#34;, JobTargetGroupArgs.builder()        
 *             .jobAgentName(&#34;agent1&#34;)
 *             .members(            
 *                 Map.ofEntries(
 *                     Map.entry(&#34;databaseName&#34;, &#34;database1&#34;),
 *                     Map.entry(&#34;membershipType&#34;, &#34;Exclude&#34;),
 *                     Map.entry(&#34;serverName&#34;, &#34;server1&#34;),
 *                     Map.entry(&#34;type&#34;, &#34;SqlDatabase&#34;)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;membershipType&#34;, &#34;Include&#34;),
 *                     Map.entry(&#34;refreshCredential&#34;, &#34;/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/group1/providers/Microsoft.Sql/servers/server1/jobAgents/agent1/credentials/testCredential&#34;),
 *                     Map.entry(&#34;serverName&#34;, &#34;server1&#34;),
 *                     Map.entry(&#34;type&#34;, &#34;SqlServer&#34;)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;elasticPoolName&#34;, &#34;pool1&#34;),
 *                     Map.entry(&#34;membershipType&#34;, &#34;Include&#34;),
 *                     Map.entry(&#34;refreshCredential&#34;, &#34;/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/group1/providers/Microsoft.Sql/servers/server1/jobAgents/agent1/credentials/testCredential&#34;),
 *                     Map.entry(&#34;serverName&#34;, &#34;server2&#34;),
 *                     Map.entry(&#34;type&#34;, &#34;SqlElasticPool&#34;)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;membershipType&#34;, &#34;Include&#34;),
 *                     Map.entry(&#34;refreshCredential&#34;, &#34;/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/group1/providers/Microsoft.Sql/servers/server1/jobAgents/agent1/credentials/testCredential&#34;),
 *                     Map.entry(&#34;serverName&#34;, &#34;server3&#34;),
 *                     Map.entry(&#34;shardMapName&#34;, &#34;shardMap1&#34;),
 *                     Map.entry(&#34;type&#34;, &#34;SqlShardMap&#34;)
 *                 ))
 *             .resourceGroupName(&#34;group1&#34;)
 *             .serverName(&#34;server1&#34;)
 *             .targetGroupName(&#34;targetGroup1&#34;)
 *             .build());
 * 
 *     }
 * }
 * 
 * ```
 * ### Create or update a target group with minimal properties.
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.sql.JobTargetGroup;
 * import com.pulumi.azurenative.sql.JobTargetGroupArgs;
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
 *         var jobTargetGroup = new JobTargetGroup(&#34;jobTargetGroup&#34;, JobTargetGroupArgs.builder()        
 *             .jobAgentName(&#34;agent1&#34;)
 *             .members()
 *             .resourceGroupName(&#34;group1&#34;)
 *             .serverName(&#34;server1&#34;)
 *             .targetGroupName(&#34;targetGroup1&#34;)
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
 * $ pulumi import azure-native:sql:JobTargetGroup targetGroup1 /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/group1/providers/Microsoft.Sql/servers/server1/jobAgents/agent1/targetGroups/targetGroup1 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:JobTargetGroup")
public class JobTargetGroup extends com.pulumi.resources.CustomResource {
    /**
     * Members of the target group.
     * 
     */
    @Export(name="members", type=List.class, parameters={JobTargetResponse.class})
    private Output<List<JobTargetResponse>> members;

    /**
     * @return Members of the target group.
     * 
     */
    public Output<List<JobTargetResponse>> members() {
        return this.members;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public JobTargetGroup(String name) {
        this(name, JobTargetGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public JobTargetGroup(String name, JobTargetGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public JobTargetGroup(String name, JobTargetGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:JobTargetGroup", name, args == null ? JobTargetGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private JobTargetGroup(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:JobTargetGroup", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sql/v20170301preview:JobTargetGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200202preview:JobTargetGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200801preview:JobTargetGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20201101preview:JobTargetGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210201preview:JobTargetGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210501preview:JobTargetGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210801preview:JobTargetGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20211101:JobTargetGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20211101preview:JobTargetGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20220201preview:JobTargetGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20220501preview:JobTargetGroup").build())
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
    public static JobTargetGroup get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new JobTargetGroup(name, id, options);
    }
}
